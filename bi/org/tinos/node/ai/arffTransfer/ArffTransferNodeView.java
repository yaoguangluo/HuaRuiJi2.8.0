package org.tinos.node.ai.arffTransfer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JScrollPane;

import org.tinos.gui.osgi.*;
public class ArffTransferNodeView extends ObjectView
{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public ArffTransferNodeView()
	{
 	}
	public void view()
	{
		scrollPane = new ScrollPane();
		panel=new Panel();
		panel.setBackground(Color.yellow);	
		//
	    JScrollPane j=new JScrollPane();
	    tableout.setBackground(new Color(240, 128, 128));
	    tableout.setPreferredSize(new Dimension(200,200));
	    tableout.setVisible(true);
		j.setViewportView(tableout);
	    //
		panel.add(j);
		scrollPane.add(panel);
		add(scrollPane);
		close=false;
	}
	    @Override  
	    public ObjectView clone() {   
	        objectView = (ObjectView)super.clone();  
	        return objectView;  
	    }  
	
	
}
