package main;

public interface MyStack<T> {
	 public void push(T element);
	 public T pop ();
	 public T peek();
	 public int size();
	 public void printStack();
}