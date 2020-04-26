package semaphone;
import java.awt.Color;

import java.awt.Container;
import java.awt.HeadlessException;
import java.util.Map;
import javax.swing.JScrollPane;
import org.tinos.engine.analysis.Analyzer;

import org.bi.processor.CoAuthorForWord;
import sample.AppBoot;
public class TaskMakeCoWorker extends Thread implements Runnable{
	public AppBoot u;
	public Analyzer analyzer;
	public Container jpanelFirstu;
	public Map<String, String> pos;
	public TaskMakeCoWorker(AppBoot u, Container jpanelFirstu, Analyzer analyzer, Map<String, String> pos) {
		this.u= u;
		this.jpanelFirstu = jpanelFirstu;
		this.analyzer = analyzer;
		this.pos = pos;
	}

	@Override
	public void run() {
		try {
			u.app = new CoAuthorForWord(u, analyzer, pos);
		} catch (HeadlessException | InterruptedException e) {
			e.printStackTrace();
		}
		u.app.setBackground(Color.white);
		JScrollPane jsp_bagua = new JScrollPane(u.app);
		jsp_bagua.setBounds(695, 290 + 100 - 65 + 50 - 215+80, 750 - 130, 440);
		jpanelFirstu.add(jsp_bagua);
		jpanelFirstu.validate();
	}
}