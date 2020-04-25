package org.tinos.language.pletl;
import java.io.File;
import java.util.HashMap;
import javax.swing.JTextPane;

import org.tinos.document.load.LoadFile;
import org.tinos.document.nero.cell.BootNeroCell;
import org.tinos.gui.node.edit.LinkList;
import org.tinos.gui.node.edit.LinkNode;
import org.tinos.gui.node.view.NodeShow;
import org.tinos.sets.stable.StableData;
public class PLETLImpl implements PLETLIntef{
	@Override
	public boolean doNeroFlow(JTextPane rightBotJTextPane, NodeShow nodeView, LinkList first
			, String documentFlowAddress, HashMap<String, Object> inputMap) {
		//很好的将 《德塔socket plsql数据库》 和 《德塔 ETL》变成脑的记忆和计算中枢配合。
		//别急，这个组合虽然没有自主意识，但是已经形成了VPCS计算神经元的单株 锥形。20200322 罗瑶光 
		try {
			String fileCurrentpath= documentFlowAddress;
			File file= new File(fileCurrentpath);
			if(!file.isFile()) {
				System.out.println(StableData.ATTENSION_RECHOICE);
				return false;
			}
			LinkNode needDeleteNode= first.first;
			while(needDeleteNode!= null) {
				first.first= first.deletNode(first.first, needDeleteNode.name
						, needDeleteNode.ID, needDeleteNode.primaryKey);
				if(null== needDeleteNode.next) {
					break;
				}
				needDeleteNode= needDeleteNode.next;
			}
			first.first= LoadFile.Load(first.first, nodeView, file, first);
			BootNeroCell.bootCell(first.first, rightBotJTextPane, null);
		} catch(Exception loadE) {
			loadE.printStackTrace();
		}
		return true;
	}
	//大爱如此
}