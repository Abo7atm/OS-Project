package ADT;

public interface Queue<T> {
	public T serve();// not empty
	public void enqueue(T e); // not full
	public int length(); 
	public boolean full();
}
