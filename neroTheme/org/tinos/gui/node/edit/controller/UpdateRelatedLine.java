package org.tinos.gui.node.edit.controller;
import org.tinos.gui.node.edit.LinkNode;
public interface UpdateRelatedLine{
	public void doUpdateRelatedLine(LinkNode first, String currentNodeName
			, int currentNodeID, String currentNodePrimaryKey);
}