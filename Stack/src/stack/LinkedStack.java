package stack;

import java.util.LinkedList;

public class LinkedStack<E> implements Stack<E> {

	private LinkedList<E> list = new LinkedList<>();

	@Override
	public void push(E e) {
		list.add(e);
	}

	@Override
	public E pop() {
		return list.pollLast();
	}

	@Override
	public E top() {
		return list.peekLast();

	}
	
	@Override
	public Stack<Integer> cloneStack() {
		return null;
		
	}
	
	public Integer[] pop(int size){
		return null;
	}

	@Override
	public int getSize() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

}