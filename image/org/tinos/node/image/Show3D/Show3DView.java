package org.tinos.node.image.Show3D;
import java.awt.Dimension;



import java.awt.Panel;
import java.awt.ScrollPane;


import javax.swing.JButton;
import javax.swing.JScrollPane;

import org.tinos.gui.osgi.*;

public class Show3DView extends ObjectView
{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public Show3DView()
	{
		super();
 	}
	public void view() throws Exception
	{
		scrollPane = new ScrollPane();
		panel=new Panel();
		JScrollPane j=new JScrollPane();
		
		test app = new test(gout);  
		app.setPreferredSize(new Dimension(800,500));
		app.setVisible(true);
		
		j.setViewportView(app);
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
