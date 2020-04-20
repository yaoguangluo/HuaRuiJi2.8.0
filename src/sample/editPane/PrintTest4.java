package sample.editPane;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
public class PrintTest4 implements Printable{
	private String prePrint;
	public PrintTest4(String string) {
		prePrint = string.toString();
		//通俗理解就是书、文档
		Book book = new Book();
		//设置成竖打
		PageFormat pf = new PageFormat();
		pf.setOrientation(PageFormat.PORTRAIT);
		//通过Paper设置页面的空白边距和可打印区域。必须与实际打印纸张大小相符。
		Paper p = new Paper();
		p.setSize(590,840);//纸张大小 
		p.setImageableArea(10,10, 590,840);//A4(595 X 842)设置打印区域，其实0，0应该是72，72，因为A4纸的默认X,Y边距是72
		pf.setPaper(p);
		//把 PageFormat 和 Printable 添加到书中，组成一个页面
		book.append(this, pf);
		//获取打印服务对象
		PrinterJob job = PrinterJob.getPrinterJob();
		//设置打印类
		job.setPageable(book);
		try {
			//可以用printDialog显示打印对话框，在用户确认后打印；也可以直接打印
			boolean a=job.printDialog();
			if(a){
				job.print();
			}
		} catch (PrinterException e) {
			e.printStackTrace();
		}
	}
	/**
	 * @param Graphic指明打印的图形环境
	 * @param PageFormat指明打印页格式（页面大小以点为计量单位，1点为1英才的1/72，1英寸为25.4毫米。A4纸大致为595×842点
	 * @param pageIndex指明页号
	 * @param 本代码片段基于lisany30201314朋友免费发布的代码上罗瑶光进行修正的，在这里谢谢他。 
	 */
	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)throws PrinterException {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>指定页号："+pageIndex);
		Component c = null;
		//print string
		String str = prePrint.toString();
		//转换成Graphics2D
		Graphics2D g2 = (Graphics2D) graphics;
		//设置打印颜色为黑色
		g2.setColor(Color.black);
		//打印起点坐标
		double x = pageFormat.getImageableX();
		double y = pageFormat.getImageableY();
		switch(pageIndex){
		case 0:
			Font font = new Font("新宋体", Font.PLAIN, 16);
			g2.setFont(font);//设置字体 
			float[] dash1 = {2.0f}; 
			//设置打印线的属性。
			//1.线宽 2、3、不知道，4、空白的宽度，5、虚线的宽度，6、偏移量
			g2.setStroke(new BasicStroke(0.5f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER
					, 2.0f, dash1, 0.0f));  
			//g2.setStroke(bs_3);//设置线宽
			float heigth = font.getSize2D();//字体高度
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>x="+x);
			Image src = Toolkit.getDefaultToolkit().getImage("D:/背景图片/yesorno.jpg");
			g2.drawImage(src,(int)x,(int)y,c);
			int img_Height=src.getHeight(c);
			//System.out.println("img_Height="+img_Height+"img_width="+img_width) ;
			//g2.drawString(str.substring(0, 30), (float)x+30, (float)y+1*heigth+img_Height);
			//g2.drawLine((int)x,(int)(y+1*heigth+img_Height+10),(int)x+200,(int)(y+1*heigth+img_Height+10));
			g2.drawImage(src,(int)x,(int)(y+1*heigth+img_Height+11),c);
			String[] lines = str.split("\r\n\r\n");
			int countOut = 0;
			for(int i = 0; i < lines.length; i++) {
				String[] lineOfStrings = lines[i].replace(" ", "").replaceAll(";+", ";").split(";");
				for(int k=0;k<lineOfStrings.length;k++) {
					if(countOut%2==0) {
						g2.drawString(lineOfStrings[k].replace("/", "   "), (float)x+30, (float)y+((countOut++)+1)*heigth+img_Height);
					}else {
						g2.drawString(lineOfStrings[k].replace("/", "   "), (float)x+230, (float)y+((countOut++)+1)*heigth+img_Height);	
					}
				}
			}
			return PAGE_EXISTS;
		default:
			return NO_SUCH_PAGE;
		}
	}

	public static void main(String[] args) {
		new PrintTest4("怎么办？ ");
	}
}