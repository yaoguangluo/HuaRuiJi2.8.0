package org.tinos.vpcs.hallKeeper;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.JTextPane;

import org.tinos.document.nero.cell.BootNeroDoc;
import org.tinos.gui.flash.ThisCanvas;
import org.tinos.gui.node.edit.LinkList;
import org.tinos.gui.node.view.NodeShow;
import org.tinos.vpcs.sets.Sets;
import org.tinos.vpcs.skivvy.Skivvy;
import org.tinos.vpcs.vision.Pillow;
import org.tinos.vpcs.vision.Vision;
public class HallKeeper{
	public static Map<Long, BootNeroDoc> hallKeeper;
	public static void vpcsRegister(LinkList first, String fileCurrentpath, NodeShow nodeView
			, JTextPane rightBotJTextPane, ThisCanvas canvas) {
		if(null== hallKeeper) {
			hallKeeper= new ConcurrentHashMap<>();
		}
		
		if(200> hallKeeper.size()) {
			try {
				BootNeroDoc bootNeroDoc= new BootNeroDoc(first, fileCurrentpath, nodeView
						, rightBotJTextPane, canvas);
				Sets.register(bootNeroDoc.getId());//sets 是sleeper运行时候里面可以分离出来的数据。
				Pillow.register(bootNeroDoc);//pillow是这些数据的分类存储器
				Vision.registerVision(bootNeroDoc);//vision是sleeper运行的具体梦境。
				hallKeeper.put(bootNeroDoc.getId(), bootNeroDoc);
				bootNeroDoc.start();
			}catch(Exception e) {
				Skivvy.working(hallKeeper, e);//skivvy负责vision， pillow，sets，sleeper 全程管理和反馈。
			}
		}
	}
}