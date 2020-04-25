package org.tinos.node.medcine.ChuFangWuXingShow;
import java.io.IOException;

import org.tinos.gui.osgi.*;
public class ChuFangWuXingShowHRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public ChuFangWuXingShowHRun( ) throws IOException{	
		super();
	}
	
	public void run(final ChuFangWuXingShowHView thisView) throws IOException{
		 thisView.topMapOut = this.topMapIn; 	
	}
}
