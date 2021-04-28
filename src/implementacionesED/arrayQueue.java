package implementacionesED;

import java.util.*;

public class arrayQueue<T> implements Queue<T>{
	
	private int head;
	private int back;
	private T[] Q;
	private int size;
	
	public arrayQueue(int initCap) {
		if(initCap < 1) {
			throw new IllegalArgumentException("initialCapacity must be >= 1");
		}
		Q = (T[]) new Object[initCap];
		head = back = 0;
		size = 0;
	}
	
	public arrayQueue(){
		this(10);
	}
	
	public boolean isEmpty(){
	return head == back;
	}
	
	public int size() {
	return this.size;
	}
	
	public void enqueue(T element) {
		if((back + 1) % Q.length == head) {  
			T[] newQ = (T[]) new Object[ 2 * Q.length];
			int sig = (head + 1) % Q.length;
			if(sig < 2 ) {
				System.arraycopy(Q, sig, newQ, 0, Q.length - 1);
			}else {
				System.arraycopy(Q, sig, newQ, 0, Q.length-sig);
				System.arraycopy(Q, 0, newQ, Q.length-sig, back+1);
			}
			head = newQ.length - 1;
			back = Q.length - 2;
			Q = newQ;
		}
		back = (back + 1) % Q.length;
		Q[back] = element;
		size++;
	}

	public T dequeue() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		head = (head + 1) % Q.length;
		T headElement = Q[head];
		Q[head] = null;
		size--;
	return headElement;
	}
	
	public T peek(){
		if(isEmpty()) {
			throw new EmptyStackException();
		}else {
			return Q[(head + 1) % Q.length];
		}
	}
	
}
