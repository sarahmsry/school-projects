import java.util.*;
public class Lab11 {
	class Node { //Created to represent tree node 
		int data;
		Node left;
		Node right;

	Node(int item) {
		data = item;
		this.left = null;
		this.right = null;
	}
}
	public Node root;
	public static class BinarySearchTree{
		Node root;
		Node prev;
		public boolean checkBT() {
			prev = null;
			return checkBT(root);
		}
		public boolean checkBT(Node node) {
			if(node != null) {
				if(!checkBT(node.left)) {
					return false;
				}
				if(prev != null && node.data <= prev.data) {
					return false;
				}
				prev = node;
				return checkBT(node.right);
			}
			return true;
		}
		public static void main(String args[]){
			Lab11 tree = new Lab11(); //Creates binary tree 
			//Nodes are entered
		    tree.root = new Node(4);
		    tree.root.left = new Node(2);
			tree.root.right = new Node(6);
		    tree.root.left.left = new Node(1);
			tree.root.left.right = new Node(3);
			tree.root.right.left = new Node(5);
			tree.root.right.right = new Node(7);
		    
		    if(tree.checkBT()) {
		    	System.out.print("TRUE");	
		    }else {
		    	System.out.print("FALSE");
		    }
	}
	}
}

/* Test Case:
	if(tree.root = null){
		System.out.println("Invalid root");
	}
	
	or in the case of having user input for the tree nodes, 
	
	if(tree.root = null){
		System.out.println("Invalid root; must be an integer);
	}
*/