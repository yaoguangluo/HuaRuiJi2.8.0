package sample;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JFrame;
public class Frame{
	public String getKey() throws IOException {
		InputStream in= getClass().getResourceAsStream("key.txt");
		BufferedReader cReader= new BufferedReader(new InputStreamReader(in));  
		String outPut= null;
		String ctempString= null; 
		int i= 0;
		while ((ctempString= cReader.readLine())!= null) {  
			if(!ctempString.replace(" ", "").equals("")) {
				outPut+= ctempString;
				i++;
				if(i>5) {
					System.out.println("Invalid rights for more pc");
					System.exit(0);
				}
			}
		}
		cReader.close();
		return outPut;
	}
	
	public static App3 NE;
	@SuppressWarnings({"deprecation"})
	public static void main(String args[]) throws Exception{
		//if(!new GetDisk().getKey().replaceAll(" ", "").contains("580307240")) {
		Process process= Runtime.getRuntime().exec(  
				new String[] {"wmic", "cpu", "get", "ProcessorId"});  
		process.getOutputStream().close();
		//Scanner sc = new Scanner(process.getInputStream());  
		//		if(!new Frame().checkKey()) {
		//			return;
		//		}
		NE= new App3();
		JFrame frame= new JFrame("养疗经 V2.1.0/ 华瑞集 V2.8.0+");
		frame.setIconImage(NE.logo.getImage());
		frame.setLayout(null);
		frame.setSize(1330, 770+ 40);
		frame.resize(1330, 770+ 40);
		frame.setResizable(false);
		frame.add(NE);
		NE.setBounds(0, 0, 1335, 770+ 45);
		NE.init();
		NE.start();
		frame.setVisible(true);
		frame.show();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowevent) {
				//String command = "taskkill /im dm_new.exe /f";  
				try {
					//Runtime.getRuntime().exec(command);
					//Runtime.getRuntime().exec("taskkill /IM javaw.exe /f ");
					System.out.println("pre closing...1");
					if(NE.m != null) {
						NE.m.stop = 1;
					}
					System.out.println("pre closing...2");
					if(NE.m != null) {
						NE.m.stop();
					}
					System.out.println("pre closing...3");
					NE.stop();
					frame.removeAll();
					System.out.println("closed");
				} catch (Exception e) {
					System.out.println("close error");
					NE = null;
					e.printStackTrace();
				}
				frame.removeAll();
				frame.disable();
				System.gc();
				System.exit(0);
			}
		});
	}
//	private boolean checkKey() throws IOException, URISyntaxException {
//		InputStream in = getClass().getResourceAsStream("key.txt");
//		BufferedReader cReader = new BufferedReader(new InputStreamReader(in));  
//		String ctempString = null; 
//		int i=0;
//		Map<String, Integer> keys=new HashMap<>();
//		while ((ctempString = cReader.readLine()) != null) {  
//			if(!ctempString.replace(" ","").equals("")) {
//				if(keys.containsKey(ctempString)) {
//					return true;
//				}
//				i++;
//				if(i>5) {
//					 System.out.println("Invalid rights for more pc");
//					 return false;
//				}else {
//					cReader.close();
//					FileWriter fw = null;
//					String v = getClass().getResource("key.txt").getPath();
//					v = URLDecoder.decode(v, "UTF-8");
//					v = v.replace("File:/", newChar);
//					try {
//						throw new IOException(v);
//					}catch(Exception e) {	
//					}
//					fw = new FileWriter(v, true);
//					fw.write(ctempString.replace(" ", "").replace("\\?", ""));
//					fw.write("\r\n");
//					fw.close();
//					return true;
//				}
//			}
//		}
//		cReader.close();
//		return true;
//	}
}