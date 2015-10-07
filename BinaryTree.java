
public class BinaryTree{
	
	Node root;
public void addNode(int key)
{
	//instanstiate the node 
	Node newNode = new Node(key);
	//When the tree is empty the root value is assigned first
	if(root == null){
	root=newNode;	
}
else
	{
		//starting point for the tree 
	Node currentNode = root;
	Node parent;
	while(true){
		parent= currentNode;

		//if the key value is lesser than the parent node
		if(key < currentNode.key)
		{
			currentNode=currentNode.leftChild;
			if(currentNode == null)
			{
				parent.leftChild = newNode;
				return;
			}
		}
		else
		{
			currentNode = currentNode.rightChild;
			if(currentNode == null)
			{
				parent.rightChild= newNode;
				return;
			}
		}

		
		}

	}

}

public void inOrderTraverseTree(Node currentNode){
	if(currentNode != null)
	{
		//start at the left ,parent, right
		inOrderTraverseTree(currentNode.leftChild);
		System.out.println(currentNode);
		inOrderTraverseTree(currentNode.rightChild);

	}
}
public void preOrderTraverseTree(Node currentNode){
	if(currentNode != null)
	{
		
		//start at the parent, left,right
		System.out.println(currentNode);
		preOrderTraverseTree(currentNode.leftChild);	
		preOrderTraverseTree(currentNode.rightChild);

	}
}
public void postOrderTraverseTree(Node currentNode){
	if(currentNode != null)
	{
		
		//start at the left,right,parent
		postOrderTraverseTree(currentNode.leftChild);	
		postOrderTraverseTree(currentNode.rightChild);
		System.out.println(currentNode);

	}
}
	public static void main(String[] args){
	
	BinaryTree runTree = new BinaryTree();
	
	//adding node values tho the tree
	runTree.addNode(50);
	runTree.addNode(25);
	runTree.addNode(15);
	runTree.addNode(30);
	runTree.addNode(75);
	runTree.addNode(85);

	System.out.println("In-Order Traversal");
	runTree.inOrderTraverseTree(runTree.root);
	System.out.println("Pre-Order Traversal");
	runTree.preOrderTraverseTree(runTree.root);
	System.out.println("Post-Order Traversal");
	runTree.postOrderTraverseTree(runTree.root);
	

			
	}
}

class Node {
	
	int key;

	Node leftChild;
	Node rightChild;

	Node(int key){
	this.key = key;		
}
public String toString(){
		return  "The Tree has a key: " + key;
	}
}
