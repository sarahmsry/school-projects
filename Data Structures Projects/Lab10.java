import java.util.*;
public class Lab10 {
	static Node root;
	public static void main(String args[]) throws Exception {
		Lab10 tree = new Lab10(); //Creates binary tree 
		
		//Nodes are entered
	    tree.root = new Node(4);
	    tree.root.left = new Node(2);
		tree.root.right = new Node(6);
	    tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(7);
	    
	    System.out.println("Level order traversal of the tree is: ");
	    printLO();
}

	 static void printLO() { //Prints the nodes of the binary tree in level order using arrayDeque 
		Queue<Node> queue = new ArrayDeque<Node>();
		queue.add(root);

		while(!queue.isEmpty()) {
			Node node = queue.poll(); //Dequeue element 
			System.out.println(node.data); //Return value  

			if(node.left != null) { //enqueue left if there are children 
				queue.add(node.left);
		}
			if(node.right != null) { //enqueue right if there are children
				queue.add(node.right);
			}
		}
	}
}
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
/* Test Case:
	if(tree.root = null){
		return 0;
	}
	
	or in the case of having user input for the tree nodes, 
	
	if(tree.root = null){
		System.out.println("Invalid root; must be an integer);
	}
*/