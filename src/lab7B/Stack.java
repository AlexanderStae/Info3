	package lab7B;

	import java.util.LinkedList;
	import java.util.List;

	public class Stack {
		private int topOfStack = 0;
		List<Integer> elements = new LinkedList<Integer>();
	 
		public int size() {
			return topOfStack;
		}
	 
		public void push(int element) {
			topOfStack++;
			elements.add(element);
		}
	 
		public int pop() throws Exception {
			if (topOfStack == 0) throw new Exception();
			int element = elements.get(--topOfStack);
			elements.remove(topOfStack);
			return element;
		} 
	 }

	