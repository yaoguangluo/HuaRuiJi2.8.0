package org.tinos.language.pletl;
import java.util.HashMap;

import javax.swing.JTextPane;

import org.LYG.GUI.nodeEdit.LinkList;
import org.LYG.GUI.nodeView.NodeShow;
public interface PLETLIntef{
	public boolean doNeroFlow(JTextPane rightBotJTextPane, NodeShow nodeView, LinkList first
			, String documentFlowAddress, HashMap<String, Object> inputMap);		
}