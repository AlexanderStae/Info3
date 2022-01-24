package lab8B;

public class Node {
	public Node next;
	public Object data;
	
	public Node(Object data, Node next) {
		this.next = next;
		this.data = data;
	}
	
	public String toString() {
		if (next == null) {
			return data.toString();
		}
		else {
			return data.toString() + ", " + next.toString();
		}
	}
}