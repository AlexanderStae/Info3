package lab8B;

public class LinkedList {
	public Node first;
	
	public LinkedList() {
		first = null;
	}
	
	public LinkedList(Node first) {
		this.first = first;
	}
	
	public boolean addNode(Node newNode) {
		if(first == null) {
			first = newNode;
		}
		else {
			newNode.next = first;
			first = newNode;
		}
		
		return first == newNode;
	}
	
	public Node deleteNode() {
		if(first == null) {
			return null;
		}
		else {
			Node deletedNode = first;
			first = first.next;
			return deletedNode;
		}
	}
	
	public Node reverse() {
		LinkedList newList = new LinkedList();
		
		Node currentNode = first;
		while(currentNode != null) {
			newList.addNode(new Node(currentNode.data, null));
			currentNode = currentNode.next;
		}
		
		first = newList.first;
		
		return first;
	}
}