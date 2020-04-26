package org.tinos.node.ai.arffTransfer;
public class ArffNode
{ 
	public String thisName;
	public ArffNode next;
	public ArffNode pre;
	public ArffNode()
	{
		next=null;
		pre=null;
		thisName=null;
	}
	public void addName(String name)
	{
		next=null;
		pre=null;
		thisName=name;
		thisName=new String(name);
	}
}