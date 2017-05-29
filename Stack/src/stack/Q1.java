package stack;

public class Q1 {

	public int[] invert(int[] n) {
		Stack<Integer> stack = new ArrayStack<>();
		int[] result = new int[n.length];

		for (int i : n) {
			stack.push(i);
		}
		
		int counter = 0;
		while (!stack.isEmpty()) {
			result[counter++] = stack.pop();
		}

		return result;
	}
}