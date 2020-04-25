package org.tinos.node.movie.LYGPlayer;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import com.sun.media.format.AviVideoFormat;
import com.sun.media.format.WavAudioFormat;
import movieProcessor.LYGFileIO;
public class jp extends JPanel
{
	private static final long serialVersionUID = 1L;
	LYGFileIO cur;
	Thread t1,t2;
    public Image img;
    public File f;
    public AviVideoFormat fmv;
    public WavAudioFormat fav;
    public String fpath;
    public pm mv;
    public ps sd;
    public int sytro=0;
    public RandomAccessFile raf;
    public LYGFileIO io;
    public BufferReader read;
    public float xrot = 0.0f;
	public jp (final String filepath) throws IOException
	{
		read=new BufferReader();
		try {
			raf= new RandomAccessFile(filepath,"r");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		io=new LYGFileIO();
		//read get pos of audio
		try {
			io.getheader(raf);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		raf.close();
		
		
		
		setLayout(new BorderLayout());
		fpath = filepath;
		JButton filter = new JButton("filter");
		filter.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			  	
			}
		});
		
		
		
		JButton j = new JButton("play");
		j.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				try {
					raf= new RandomAccessFile(filepath,"r");
					} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				  //read rand file
				if(mv==null)
				{
				  mv= new pm(raf,io,read);
				  mv.setPreferredSize(new Dimension(600,400));
				  mv.setVisible(true);
				  add(mv, BorderLayout.CENTER);
				  t1=new Thread(mv);
				  t1.setPriority(Thread.MIN_PRIORITY);
	              t1.start();
				  mv.updateUI();
				}
	             if(sd==null) 
	             {
				  sd = new ps(raf,io,read);
				  sd.setPriority(Thread.MIN_PRIORITY);
				  sd.start();
	             } 
	            
	             if(t1.isInterrupted()&&t2.isInterrupted())
	             {
	            	 t1.start();
	            	 t2.start();
	             }       
			}
		});	
		
		JButton j2 = new JButton("stop");
		j2.addActionListener(new ActionListener() 
		{
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) 
			{	
				if(!t1.isInterrupted() || !t2.isInterrupted())
				{
					t1.stop();
					t2.stop();	
				}
			}
		});	
		
		
		JButton j1=new JButton("close");
		j1.addActionListener(new ActionListener() 
		{
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) 
			{
				if(t1!=null)
				{
				  mv = null;
				  t1.stop();
				  t1 = null;
				}
				if(sd!=null)
				{
				  try {
					sd.raf.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                  sd = null;			
				}
				if(raf!=null)
				{
					try {
						raf.close();
						raf=null;
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		JPanel jpButtons = new JPanel();
		jpButtons.setLayout(new FlowLayout());
		jpButtons.add(j);
		jpButtons.add(j2);
		jpButtons.add(j1);
		jpButtons.add(filter);
		
		Box botBox = new Box(BoxLayout.Y_AXIS);
		JSlider sliderx = new JSlider(0 , (int) io.duration); 
        sliderx.setSnapToTicks(true);  
        sliderx.setPaintTicks(true);  
        sliderx.setMajorTickSpacing(20);  
        sliderx.setMinorTickSpacing(5);  
        sliderx.addChangeListener( 
        		    new ChangeListener()  
        	        {    
        	            public void stateChanged(ChangeEvent event)  
        	            {    
        	                //鍙栧嚭婊戝姩鏉＄殑鍊硷紝骞跺湪鏂囨湰涓樉绀哄嚭鏉� 
        	                JSlider source = (JSlider) event.getSource();  
        	                xrot= source.getValue();  
        	            }
 
        	        });  ;
		
        botBox.add(sliderx);
        botBox.add(jpButtons);
		add(botBox, BorderLayout.SOUTH);
	}
}