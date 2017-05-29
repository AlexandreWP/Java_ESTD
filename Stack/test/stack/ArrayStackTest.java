package stack;

import org.junit.Assert;
import org.junit.Test;

public class ArrayStackTest {

	@Test
	public void pushTest() {
		Stack<String> stack = new ArrayStack<>();
		Assert.assertEquals(0, stack.getSize());
		Assert.assertTrue(stack.isEmpty());
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertEquals(3, stack.getSize());
		Assert.assertFalse(stack.isEmpty());
	}

	@Test
	public void topTest() {
		Stack<String> stack = new ArrayStack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertEquals(3, stack.getSize());
		Assert.assertEquals("C", stack.top());
		Assert.assertEquals("C", stack.top());
		Assert.assertEquals(3, stack.getSize());
	}
	
	@Test
	public void popTest() {
		Stack<String> stack = new ArrayStack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertEquals("C", stack.pop());
		Assert.assertEquals("B", stack.pop());
		Assert.assertEquals("A", stack.pop());
		Assert.assertEquals(0, stack.getSize());
		Assert.assertTrue(stack.isEmpty());
		Assert.assertEquals(null, stack.pop());
	}	
	
	@Test
	public void resizeTest() {
		Stack<String> stack = new ArrayStack<>(1);

		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		Assert.assertEquals(3, stack.getSize());
		Assert.assertFalse(stack.isEmpty());
	}	
	
}