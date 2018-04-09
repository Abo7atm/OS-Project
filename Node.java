
public class Node {
	private PCB data;
	private Node next;
	
	public Node(PCB p) {
		this.data = p;
	}
	
	public void setNext(Node n) {
		next = n;
	}
	
	public Node getNext() {
		return next;
	}
}
