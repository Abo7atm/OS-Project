
public class Node <T> {
	
	public T data;
	public Node <T> next;
	public Node<T> previous;
	public int priority;
	
	public Node(){
		data=null;
		next=null;
		previous=null;
	}
		
	public Node(T data){
		this.data=data;
		next=null;
		this.previous=null;
	}

	public Node(T e,int p){
		data=e;
		this.priority=p;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
