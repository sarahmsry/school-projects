import java.util.*;
public class BST{
	public static void main(String[] args) {
		BST tree = new BST(); //Creates binary search tree 
		//nodes entered 
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(6);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(7);
		
		System.out.println("In Order Traversal: ");
		tree.deleteNode(tree.root, tree.root.data); //Deletes root node 
		tree.inOrderTrav(tree.root); //Performs in order traversal 
	}
	Node root = null;
	public void inOrderTrav(Node root) { //Performs in order traversal 
		if(root != null) { //Checks if root is empty 
			inOrderTrav(root.left);
			System.out.print(root.data + "");
			inOrderTrav(root.right);
		}
	}
	public Node deleteNode(Node root, int data) { //Deletes root node 
		if(data < root.data) { //Checks if data is less than root
			root.left = deleteNode(root.left, data);
		}else if(data > root.data) { //Checks if data is more than root 
			root.right = deleteNode(root.right, data);
		}else {
			if(root.left == null) { //Checks if root of left subtree is empty 
				return root.right;
			}else if(root.right == null) { //Checks if root of right subtree is empty 
				return root.left;
			}
			root.data = minValue(root.right);
			root.right = deleteNode(root.right, root.data);
		}
		return root;
	}
	public int minValue(Node root) {  
		int value = root.data;
		while(root.left != null) { //Executes as long as the left root is not empty 
			value = root.left.data;
			root = root.left;
		}
		return value;
	}
	static class Node{ //Created to represent tree node 
		int data;
		Node left, right;
		
		public Node(int item){
			this.data = item;
			left = null;
			right = null;
		}
	}
}
//Test Case: Checks if root node is empty 
/* if(root == null) {
		System.out.println("Invalid root"); */
