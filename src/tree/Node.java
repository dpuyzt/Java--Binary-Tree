package tree;

public class Node {
	
	private int veri;
	private Node sagNode;
	private Node solNode;
	
	public Node(int veri) {
		this.veri=veri;
		sagNode=null;
		solNode=null;
	}
	
	public Node() {
		sagNode=null;
		solNode=null;
		veri=0;
	}

	public int getVeri() {
		return veri;
	}

	public void setVeri(int veri) {
		this.veri = veri;
	}

	public Node getSagNode() {
		return sagNode;
	}

	public void setSagNode(Node sagNode) {
		this.sagNode = sagNode;
	}

	public Node getSolNode() {
		return solNode;
	}

	public void setSolNode(Node solNode) {
		this.solNode = solNode;
	}
	
	

	
	
	

}
