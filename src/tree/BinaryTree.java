package tree;

public class BinaryTree {

	private Node root;

	public BinaryTree() {
		root = null;
	}

	public boolean bosMu() {

		if (root == null) {
			return true;
		}

		return false;
	}

	public void ekle(int veri) {
		root = ekle(root, veri);
	}

	private Node ekle(Node node, int veri) {
		if (node == null) {
			node = new Node(veri);
		}

		else {

			if (node.getSagNode() == null) {
				node.setSagNode(ekle(node.getSagNode(), veri));
			} else
				node.setSolNode(ekle(node.getSolNode(), veri));
		}
		return node;
	}

	public int nodeSayisi() {
		return nodeSayisi(root);
	}

	private int nodeSayisi(Node root) {
		if (root == null)
			return 0;
		else {
			int sayac = 1;
			sayac = sayac + nodeSayisi(root.getSolNode());
			sayac = sayac + nodeSayisi(root.getSagNode());
			return sayac;
		}

	}

	public boolean arama(int val) {
		return arama(root, val);
	}

	private boolean arama(Node node, int veri) {
		if (node.getVeri() == veri) {
			return true;
		}

		if (node.getSolNode() != null) {
			if (arama(node.getSolNode(), veri)) {
				return true;
			}
		}

		if (node.getSagNode() != null) {
			if (arama(node.getSagNode(), veri)) {
				return true;
			}
		}
		return false;
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node node) {
		if (node != null) {

			inOrder(node.getSolNode());
			System.out.print(node.getVeri() + " ");
			inOrder(node.getSagNode());
		}
	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node node) {
		if (node != null) {
			System.out.print(node.getVeri() + " ");
			preOrder(node.getSolNode());
			preOrder(node.getSagNode());
		}
	}

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(Node node) {
		if (node != null) {
			postOrder(node.getSolNode());
			postOrder(node.getSagNode());
			System.out.print(node.getVeri() + " ");
		}
	}

}
