package org.LYG.node.movie.AVItoLYG;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JButton;

import org.LYG.GUI.OSGI.*;



import java.awt.FileDialog;


import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
public class AVItoLYGNodePanel extends ObjectPanel
{
	private static final long serialVersionUID = 1L;
	private FileDialog filedialog;
	public AVItoLYGNodePanel(final AVItoLYGNodeRun thisRun)
	{
		setLayout(null);
		scrollPane = new ScrollPane();
		add(scrollPane);
		panel=new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		JButton button = new JButton("Finish");
		button.setBounds(0, 0, 200, 30);
		button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
            	System.out.println(e.getSource());
                	close=true;
                	thisRun.value=1;
            }
        });   
		panel.add(button);
		JButton readfile= new JButton("Read AVI");
		readfile.setBounds(0, 35, 200, 40);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 filedialog=new FileDialog(new Frame(),"readfilechoose",FileDialog.LOAD);
				 filedialog.setVisible(true);
				 thisRun.filepath=filedialog.getDirectory()+filedialog.getFile();
			     System.out.println(thisRun.filepath);

				}
			});
		panel.add(readfile);
		
		
		JButton readfile1= new JButton("Read AVI'S WAV");
		readfile1.setBounds(0, 80, 200, 50);
		readfile1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 filedialog=new FileDialog(new Frame(),"readfilechoose",FileDialog.LOAD);
				 filedialog.setVisible(true);
				 thisRun.filepathWAV=filedialog.getDirectory()+filedialog.getFile();
			     System.out.println(thisRun.filepath);

				}
			});
		panel.add(readfile1);
		JButton writefile= new JButton("WRITE LYG");
		writefile.setBounds(0, 135, 200,60 );
		writefile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				 filedialog= new FileDialog(new Frame(),"writefilechoose",FileDialog.LOAD);
				 filedialog.setVisible(true);
				 thisRun.writefile= filedialog.getDirectory()+ filedialog.getFile();
			     System.out.println(thisRun.writefile);

				}
			});
		panel.add(writefile);	
		scrollPane.add(panel);
		close= false;
 	}
	public void config()
	{    
		System.out.println("configued");      
	}
}
