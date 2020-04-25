package org.tinos.node.suggest.read;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.tinos.gui.osgi.*;

import sample.TableSorter;
public class ReadNodeView extends ObjectView implements MouseListener{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public List<String[]> indexResult;
	public ReadNodeView(){
	}
	@SuppressWarnings("serial")
	public void view() throws Exception{
		try {
			tableout= new JTable();
			Object[][] tableData_old= new Object[indexResult.size()][3];
			Object[] columnTitle= {"路径", "匹配打分", "重要性"};  
			scrollPane= new ScrollPane();
			panel= new Panel();
			panel.setBackground(Color.yellow);	
			JScrollPane j= new JScrollPane();
			for(int i= 0; i< indexResult.size(); i++) {
				tableData_old[i][0]= indexResult.get(i)[2];
				tableData_old[i][1]= indexResult.get(i)[1];
				tableData_old[i][2]= indexResult.get(i)[0];
			}
			DefaultTableModel newTableModel= new DefaultTableModel(tableData_old,columnTitle){  
				@Override  
				public boolean isCellEditable(int row,int column){  
					return false;  
				}  
			};  
			TableSorter sorter= new TableSorter(newTableModel); //ADDE
			sorter.setTableHeader(tableout.getTableHeader());
			tableout.setModel(sorter); 
			tableout.getColumnModel().getColumn(0).setPreferredWidth(550);
			tableout.getColumnModel().getColumn(1).setPreferredWidth(50);
			tableout.getColumnModel().getColumn(2).setPreferredWidth(50);
			tableout.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			tableout.setBackground(new Color(240, 128, 128));
			tableout.setPreferredSize(new Dimension(1000, 800));
			tableout.addMouseListener(this);
			tableout.setVisible(true);
			j.setViewportView(tableout);
			panel.add(j);
			scrollPane.add(panel);
			add(scrollPane);
			close= false;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override  
	public ObjectView clone() {   
		objectView = (ObjectView)super.clone();  
		return objectView;  
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		int row= tableout.getSelectedRow();
		int col= tableout.getSelectedColumn();
		String value= (String)tableout.getValueAt(row, col);
		if(value.contains(".txt")) {
			try {
				Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+value);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}  
}
