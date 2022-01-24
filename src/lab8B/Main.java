package lab8B;

public class Main {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList list3 = new LinkedList();
		LinkedList list4 = new LinkedList();
		LinkedList list5 = new LinkedList();
		LinkedList list6 = new LinkedList();
		LinkedList list7 = new LinkedList();
		LinkedList list8 = new LinkedList();
		LinkedListTest tester = new LinkedListTest();

		// Delete tests
		System.out.println("Delete test 1: " + tester.testDeleteNode(list1));

		list2.addNode(new Node('1', null));
		System.out.println("Delete test 2: " + tester.testDeleteNode(list2));

		list3.addNode(new Node('1', null));
		list3.addNode(new Node('2', null));
		System.out.println("Delete test 3: " + tester.testDeleteNode(list3));
		
		// Reverse tests
		System.out.println("Reverse test 1: " + tester.testReverseListRandom(list4));

		list5.addNode(new Node('1', null));
		System.out.println("Reverse test 2: " + tester.testReverseListRandom(list5));

		list6.addNode(new Node('1', null));
		list6.addNode(new Node('2', null));
		System.out.println("Reverse test 3: " + tester.testReverseListRandom(list6));

		list7.addNode(new Node('1', null));
		list7.addNode(new Node('2', null));
		list8.addNode(new Node('3', null));
		System.out.println("Reverse test 4: " + tester.testReverseListRandom(list6));

		list8.addNode(new Node('1', null));
		list8.addNode(new Node('2', null));
		list8.addNode(new Node('3', null));
		list8.addNode(new Node('4', null));
		list8.addNode(new Node('5', null));
		list8.addNode(new Node('6', null));
		System.out.println("Reverse test 5: " + tester.testReverseListRandom(list6));
	}
}