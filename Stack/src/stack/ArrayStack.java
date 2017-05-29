package stack;

public class ArrayStack<E> implements Stack<E> {

	private E[] array;

	private int position = 0;

	public ArrayStack() {
		array = (E[]) new Object[20];
	}

	public ArrayStack(int i) {
		array = (E[]) new Object[i];
	}

	@Override
	public void push(E e) {

		if (position == array.length) {
			System.out.println("Redimensionando...");
			E[] temp = (E[]) new Object[array.length * 2];
			System.arraycopy(array, 0, temp, 0, array.length);
			array = temp;
		}

		array[position] = e;
		position++;
	}

	@Override
	public E pop() {
		if (isEmpty()) {
			return null;
		} else {
			E aux = array[position - 1];
			array[position - 1] = null;
			position--;
			return aux;
		}
	}

	@Override
	public E top() {
		if (isEmpty()) {
			return null;
		} else {
			return array[position - 1];

		}
	}

	@Override
	public int getSize() {
		return position;
	}

	@Override
	public boolean isEmpty() {
		return (position == 0);
	}
	
	//Question 2
	@Override
	public Integer[] pop(int size){
		if(size > position){
			size = position;
		}
		Integer[] array = new Integer[size];
		
		int i = 0;
		while(top() != null){
			if(i == size){
				return array;
			}
			array[i] = (Integer) pop();
			i++;
		}
		
		return array;
	}
	
	//Question 3????????????????
	public ArrayStack<Integer> toArray(int[] array){
		ArrayStack<Integer> stack = new ArrayStack<Integer>(array.length);
		
		for (int i : array) {
			stack.push(i);
		}		
		return stack;
	}
	
	//Question 4 ??????????????????????????
	public Integer[] clear(){
		Integer[] array = new Integer[position];
		
		int i = 0;
		while(top() != null){
			array[i] = (Integer) pop();
			i++;
		}
		
		return array;
	}
	
	//Question 5
	@Override
	public Stack<Integer> cloneStack() {
		Stack<Integer> newStack = new ArrayStack<>(array.length);
		
		for (E e : array) {
			if(e != null){
				newStack.push((Integer)e);
			}
		}
		
		return newStack;
	}
	
	public int[] evenNumbers(ArrayStack<Integer> stack){
		int[] array = new int[stack.position];
		int i = 0;
		int actual = 0;
		while(stack.top() != null){
			actual = stack.pop();
			if(actual % 2 == 0){
				array[i] = actual;
				i++;
			}			
		}
		return array;
	}
	
	

}