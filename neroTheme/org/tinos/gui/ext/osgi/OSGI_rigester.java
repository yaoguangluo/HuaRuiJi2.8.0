package org.tinos.gui.ext.osgi;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

import javax.swing.JTextPane;

import org.tinos.node.sound.butterworth.filter.ButterworthFilterNodeInterface;
import org.tinos.node.sound.fft.FFTFilterNodeInterface;
import org.tinos.node.sound.fft2d.filter.ft2DFilterInterface;
import org.tinos.node.sound.frequency.count.freqCountNodeInterface;
import org.tinos.node.sound.guassian.wav2D.Filter.GuassianWav2DFilterNodeInterface;
import org.tinos.node.sound.hough.wav.filter.HoughWavFilterNodeInterface;
import org.tinos.node.sound.laplacian.filter.LaplacianFilterNodeInterface;
import org.tinos.node.sound.log.fft.logFFTInterface;
import org.tinos.node.sound.log.fft.count.logFFTcountInterface;
import org.tinos.node.sound.lyg.filter.lygFilterNodeInterface;
import org.tinos.node.sound.lyg.slave.filter.lygSlaveFilterInterface;
import org.tinos.node.sound.max.mini.filter.MaxMiniFilterNodeInterface;
import org.tinos.node.sound.median.filter.MedianFilterNodeInterface;
import org.tinos.node.sound.wav.read.WavReadNodeInterface;
import org.tinos.node.sound.wave.play.wavePlayNodeInterface;
import org.tinos.node.suggest.read.ReadNodeInterface;
import org.tinos.node.ai.arffTransfer.arffTransferNodeInterface;
import org.tinos.gui.osgi.*;
import org.tinos.node.ai.WekaPilot2D.WekaPilot2DNodeInterface;
import org.tinos.node.ai.XlsReaderNode.XlsReaderNodeInterface;
import org.tinos.node.image.EmbossFilter.EmbossFilterInterface;
import org.tinos.node.image.FindColorB.FindColorBInterface;
import org.tinos.node.image.FindColorG.FindColorGInterface;
import org.tinos.node.image.FindColorR.FindColorRInterface;
import org.tinos.node.image.GrayFilter.GrayFilterNodeInterface;
import org.tinos.node.image.GuassianFilter.GuassianFilterInterface;
import org.tinos.node.image.HoughTransform.HoughTransformInterface;
import org.tinos.node.image.LaplacianFilter.LaplacianFilterInterface;
import org.tinos.node.image.MedianImageFilter.MedianImageNodeInterface;
import org.tinos.node.image.MorphologyFilter.MorphologyFilterInterface;
import org.tinos.node.image.Show3D.Show3DInterface;
import org.tinos.node.image.SobelFilter.SobelFilterNodeInterface;
import org.tinos.node.image.imageRead.imageReadNodeInterface;
import org.tinos.node.image.imageStrech.imageStrechNodeInterface;
import org.tinos.node.medcine.ChuFangWuXingShow.ChuFangWuXingShowHInterface;
import org.tinos.node.medcine.addChuFangAttribute.AddChuFangAttributeHInterface;
import org.tinos.node.medcine.editPaneReader.EditPanelReaderInterface;
import org.tinos.node.medcine.editPaneReaderH.EditPanelReaderHInterface;
import org.tinos.node.medcine.filterChuFangJinJiAttribute.filterChuFangJinJiAttributeHInterface;
import org.tinos.node.medcine.filterChuFangJinJiKeyWordsAttribute.filterChuFangJinJiKeyWordsAttributeHInterface;
import org.tinos.node.medcine.filterChuFangXingWeiKeyWordsAttribute.filterChuFangXingWeiKeyWordsAttributeHInterface;
import org.tinos.node.medcine.updateToEditPane.updateToEditPaneInterface;
import org.tinos.node.movie.AVItoLYG.AVItoLYGNodeInterface;
import org.tinos.node.movie.LYGPlayer.LYGPlayerNodeInterface;
import org.tinos.node.movie.LYGRead.LYGReadNodeInterface;
import org.tinos.node.movie.LYGWrite.LYGWriteNodeInterface;
import org.tinos.node.movie.MovieTransfer.MovieTransferNodeInterface;
import org.tinos.sets.stable.StableData;

import comp.filenameFilter.TXTFilter;

public class OSGI_rigester{
	JTextPane text;
	Object[][] tableData_old;
	public OSGI_rigester(Object[][] tableData_old, JTextPane text){
		this.text= text;
		this.tableData_old= tableData_old;
	}
	@SuppressWarnings("resource")
	public NodeOSGI Rigester(NodeOSGI first, LinkOSGI link) throws IOException{
		String jarCategoryLink= "";	
		FileDialog filedialog= new FileDialog(new Frame(), StableData.ATTENSION_LOAD_PLUGIN
				, FileDialog.LOAD);
		filedialog.setFilenameFilter(new TXTFilter(StableData.FILE_FORMAT_ETL));
		filedialog.setVisible(true);
		jarCategoryLink= filedialog.getDirectory();
		//System.out.println(jarCategoryLink);
		if(null== jarCategoryLink|| jarCategoryLink.isEmpty()|| jarCategoryLink.contains
				(StableData.FILE_FORMAT_JAR)) {
			System.out.println(StableData.ATTENSION_RECHOICE);
			return first;
		}
		File file= new File(jarCategoryLink);
		if(file.isFile()) {
			System.out.println(StableData.ATTENSION_FILE_CHOICE);
			return first;
		}
		File[] files= file.listFiles();
		for(int i= 0; i< files.length; i++) {
			@SuppressWarnings("deprecation")
			URLClassLoader loader= new URLClassLoader(new URL[]{ files[i].toURL() });  
			String filename= files[i].getName().replace(StableData.FILE_FORMAT_JAR
					, StableData.STRING_EMPTY);
			String[] columns= filename.split("\\."); 
			Class<?> myclass= null;
			try {
				myclass = loader.loadClass(filename+ "."+ columns[columns.length- 1]
						+ StableData.NODE_NODE_INTERFACE);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Object myobject= null;
			try {
				myobject = myclass.newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
			ObjectInterface objectInterface= (ObjectInterface) myobject; 
			first= link.addNode(first, objectInterface);
		}
		//зЂВс
		ObjectInterface XlsReadernode = new XlsReaderNodeInterface();
		first = link.addNode(first, XlsReadernode);

		ObjectInterface arffTransferNode = new arffTransferNodeInterface();
		first = link.addNode(first, arffTransferNode);

		ObjectInterface WekaPilot2DNode = new WekaPilot2DNodeInterface();
		first = link.addNode(first, WekaPilot2DNode);

		ObjectInterface imageReadNode = new imageReadNodeInterface();
		first = link.addNode(first, imageReadNode);

		ObjectInterface imageStrechNode = new imageStrechNodeInterface();
		first = link.addNode(first, imageStrechNode);

		ObjectInterface MedianImageNode = new MedianImageNodeInterface();
		first = link.addNode(first, MedianImageNode);

		ObjectInterface GrayFilterNode = new GrayFilterNodeInterface();
		first = link.addNode(first, GrayFilterNode);

		ObjectInterface GuassianFilterNode = new GuassianFilterInterface();
		first = link.addNode(first,	GuassianFilterNode);

		ObjectInterface FindColorRNode = new FindColorRInterface();
		first = link.addNode(first,	FindColorRNode);
		
		ObjectInterface FindColorGNode = new FindColorGInterface();
		first = link.addNode(first,	FindColorGNode);
		
		ObjectInterface FindColorBNode = new FindColorBInterface();
		first = link.addNode(first,	FindColorBNode);

		ObjectInterface SobelFilterNode = new SobelFilterNodeInterface();
		first = link.addNode(first,	SobelFilterNode);

		ObjectInterface EmbossFilterNode = new EmbossFilterInterface();
		first = link.addNode(first,	EmbossFilterNode);

		ObjectInterface LaplacianFilterNode = new LaplacianFilterInterface();
		first = link.addNode(first,	LaplacianFilterNode);

		ObjectInterface HoughTransformNode = new HoughTransformInterface();
		first = link.addNode(first, HoughTransformNode);

		ObjectInterface WavReadNode = new WavReadNodeInterface();
		first = link.addNode(first, WavReadNode);

		ObjectInterface MedianFilterNode = new MedianFilterNodeInterface();
		first = link.addNode(first, MedianFilterNode);

		ObjectInterface ButterworthFilterNode = new ButterworthFilterNodeInterface();
		first = link.addNode(first, ButterworthFilterNode);

		ObjectInterface LaplacianWaveFilterNode = new LaplacianFilterNodeInterface();
		first = link.addNode(first, LaplacianWaveFilterNode);

		ObjectInterface HoughWavFilterNode = new HoughWavFilterNodeInterface();
		first = link.addNode(first, HoughWavFilterNode);

		ObjectInterface GuassianWav2DFilterNode = new GuassianWav2DFilterNodeInterface();
		first = link.addNode(first, GuassianWav2DFilterNode);

		ObjectInterface MaxMiniFilterNode = new MaxMiniFilterNodeInterface();
		first = link.addNode(first, MaxMiniFilterNode);

		ObjectInterface wavePlayNode = new wavePlayNodeInterface();
		first = link.addNode(first, wavePlayNode);

		ObjectInterface Show3DNode = new Show3DInterface();
		first = link.addNode(first, Show3DNode);

		ObjectInterface MorphologyFilter = new MorphologyFilterInterface();
		first = link.addNode(first, MorphologyFilter);

		ObjectInterface LYGReadNode = new LYGReadNodeInterface();
		first = link.addNode(first, LYGReadNode);

		ObjectInterface LYGWriteNode = new LYGWriteNodeInterface();
		first = link.addNode(first, LYGWriteNode);

		ObjectInterface MovieTransferNode = new MovieTransferNodeInterface();
		first = link.addNode(first, MovieTransferNode);

		ObjectInterface AVItoImagesNode = new AVItoLYGNodeInterface();
		first = link.addNode(first, AVItoImagesNode);

		ObjectInterface LYGPlayerNode = new LYGPlayerNodeInterface();
		first = link.addNode(first, LYGPlayerNode);

		ObjectInterface FFTFilterNode = new FFTFilterNodeInterface();
		first = link.addNode(first, FFTFilterNode);

		ObjectInterface freqCountNode = new freqCountNodeInterface();
		first = link.addNode(first, freqCountNode);

		ObjectInterface lygFilterNode = new lygFilterNodeInterface();
		first = link.addNode(first, lygFilterNode);

		ObjectInterface lygFilterComp = new ft2DFilterInterface();
		first = link.addNode(first, lygFilterComp);

		ObjectInterface lygSlave = new lygSlaveFilterInterface();
		first = link.addNode(first, lygSlave);

		ObjectInterface logFFT = new logFFTInterface();
		first = link.addNode(first, logFFT);

		ObjectInterface logFFTcount = new logFFTcountInterface();
		first = link.addNode(first, logFFTcount);

		ObjectInterface editPanelReader = new EditPanelReaderInterface(this.text);
		first = link.addNode(first, editPanelReader);

		ObjectInterface editPanelReaderH= new EditPanelReaderHInterface(this.text);
		first = link.addNode(first, editPanelReaderH); 	

		ObjectInterface addChuFangAttributeH= new AddChuFangAttributeHInterface(this.tableData_old
				, this.text);
		first = link.addNode(first,addChuFangAttributeH); 

		ObjectInterface filterChuFangJinJiAttributeH= 
				new filterChuFangJinJiAttributeHInterface(this.tableData_old, this.text);
		first = link.addNode(first, filterChuFangJinJiAttributeH); 

		ObjectInterface chuFangWuXingShowHInterface= 
				new ChuFangWuXingShowHInterface(this.tableData_old, this.text);
		first = link.addNode(first,chuFangWuXingShowHInterface); 

		ObjectInterface filterChuFangXingWeiKeyWordsAttributeH= 
				new filterChuFangXingWeiKeyWordsAttributeHInterface(this.tableData_old, this.text);
		first = link.addNode(first, filterChuFangXingWeiKeyWordsAttributeH); 

		ObjectInterface filterChuFangJinJiKeyWordsAttributeH= 
				new filterChuFangJinJiKeyWordsAttributeHInterface(this.tableData_old, this.text);
		first = link.addNode(first, filterChuFangJinJiKeyWordsAttributeH); 

		ObjectInterface updateToEditPane= 
				new updateToEditPaneInterface(this.tableData_old, this.text);
		first = link.addNode(first, updateToEditPane); 

		ObjectInterface readNodeInterface= 
				new ReadNodeInterface(this.tableData_old, this.text);
		first = link.addNode(first, readNodeInterface); 

		return first;	
	}
}