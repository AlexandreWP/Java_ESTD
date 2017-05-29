package stack;

public interface Stack<E> {

	void push(E e);
	
	E pop();
	
	E top();
	
	int getSize();
	
	boolean isEmpty();
	
	Stack<Integer> cloneStack();
	
	public Integer[] pop(int size);
}