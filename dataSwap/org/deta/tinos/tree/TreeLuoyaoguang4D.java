package org.deta.tinos.tree;
public class TreeLuoyaoguang4D{
	@SuppressWarnings("unused")
	private static void sort(Node head, String[] testValue, int scale) {
		for(int i= 0; i< testValue.length; i++) {
			addNode(head, testValue[i], scale);	
		}
	}

	private static void addNode(Node head, String testValue, int scale) {
		Node temp= head;
		if(null== temp.value) {
			temp.value= testValue;
		}else {
			for(int i= 0; i< scale- 1; i++) {
				if(temp.value.toLowerCase().charAt(i)
						< testValue.toLowerCase().charAt(i)) {
					boolean find= true;
					for(int p= 0; p< scale; p++) {
						if(temp.value.charAt(p)!= testValue.charAt(p)) {
							find= false;
						}
					}
					if(find) {
						if(temp.left!= null) {
							addNode(head.left, testValue, scale);	
						}else {
							temp.left= new Node();
							temp.left.value= testValue;
						}
					}
				}else {
					boolean find= true;
					for(int p= 0; p< scale; p++) {
						if(temp.value.charAt(p)!= testValue.charAt(p)) {
							find= false;
						}
					}
					if(find) {
						if(temp.left!= null) {
							addNode(head.left, testValue, scale);	
						}else {
							temp.left= new Node();
							temp.left.value= testValue;
						}
					}
				}
			}
		}
	}	
}

class Node{
	String value;
	public Node left;
	public Node right;
}