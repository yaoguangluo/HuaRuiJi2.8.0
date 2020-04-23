package press;


public class Node implements Cloneable{
	public int value;
	public Node left;
	public Node right;
	public Node luoyaoguang() throws CloneNotSupportedException {
		return this;   
	}
}