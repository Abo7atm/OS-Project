
public class Node {
	private Process data;
	private Node next;
	public Node(Process p) {
		this.data = p;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public Node getNext() {
		return next;
	}
}
