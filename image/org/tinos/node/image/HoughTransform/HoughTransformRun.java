package org.tinos.node.image.HoughTransform;
import imageProcessor.HoughTransform;
import imageProcessor.RegionGet;

import java.io.IOException;

import org.tinos.gui.osgi.*;
public class HoughTransformRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public HoughTransformRun( ) throws IOException{	
		super();
	}
	public void run(final HoughTransformView thisView) throws IOException{
		System.out.println("runed"+value); 
		int out[][] = new int[topgin.length][topgin[0].length];
		for (int i = 0; i < topgin.length; i++) {
			for (int j = 0; j < topgin[0].length; j++) {
				out[i][j]=topgin[i][j];
			}
		}		
		RegionGet thisfile =new RegionGet(out);
		int []region=thisfile.new_region;
		HoughTransform ht = new HoughTransform();
		ht.initHTMatrix(out);
		for(int i=1;i<region.length;i++){
			ht.HoughTransformLoop(out,region[i],1);
		}
		thisView.gout=ht.HTMatrix;
	}
}
