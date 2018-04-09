
public class LinkedPQ <T> {

	private int size;
	private Node<T> head;
	
	public LinkedPQ(){
		size=0;
		head=null;
	}

	public boolean full(){
		return false;
	}

	public int length(){
		return size;
	}

	public void enqueue(T e ,int pty){
		
		Node<T> te = new Node<T>(e,pty);
		if(size==0 || head.priority<pty)
			head=te;

		else{
			Node<T> p=head;
			Node<T> q=null;
			
			if(p!=null || p.priority>=pty)
			{
				q=p;
				p=p.next;
			}
			te.next=p;
			q.next=te;
		
		}
		
		size++;
	}

	public Node<T> serve(){
		Node<T> te = head;
		Node<T> p = new Node<T>(te.data,te.priority);
		head=head.next;
	size--;
		return p;
		
	}
	
}
