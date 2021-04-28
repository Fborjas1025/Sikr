package implementacionesED;

public interface Queue<T> {
	
	boolean isEmpty();
	int size();
	void enqueue(T element);
	T dequeue();
	T peek();
}
