package org.tinos.language.pletl;
import java.util.HashMap;

import javax.swing.JTextPane;

import org.tinos.gui.node.edit.LinkList;
import org.tinos.gui.node.view.NodeShow;
public interface PLETLIntef{
	public boolean doNeroFlow(JTextPane rightBotJTextPane, NodeShow nodeView, LinkList first
			, String documentFlowAddress, HashMap<String, Object> inputMap);		
}