package lab8B;

import java.util.Random;

public class LinkedListTest {
	private Assertion asserter = new Assertion();
	
	/**
	 * Tests if the deleted node was actually removed
	 * @param list
	 * @return boolean
	 */
	public boolean testDeleteNode(LinkedList list) {
		Node oldSecond;
		if(list.first != null) {
			if(list.first.next != null) {
				oldSecond = list.first.next;
			}
			else {
				oldSecond = null;
			}
		}
		else {
			oldSecond = null;
		}
		
		list.deleteNode();
		
		return asserter.assertEquals(list.first, oldSecond);
	}
	
	/**
	 * Tests if the list was actually reversed
	 * @param list
	 * @return boolean
	 */
	public boolean testReverseListRandom(LinkedList list) {
		Node oldFirst = null;
		Node currentNode = null;
		Node oldRandom = null;
		Node oldLast = null;
		Node newRandom = null;
		Node newLast = null;
		Node newFirst = null;
		
		int listLength = 0;
		
		if(list.first == null) {
			System.out.println("The list has no items.");
			return true;
		}
		else if(list.first.next == null) {
			System.out.println("The list has only one item.");
			return true;
		}
		else {
			Random randomGenerator = new Random();
			
			oldFirst = list.first;
			
			currentNode = list.first;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
				listLength++;
			}
			oldLast = currentNode;
			
			// Choose a random node from the list
			// Check its new position after reversing
			int randomPosition = 0;
			if(listLength > 2) {
				randomPosition = randomGenerator.nextInt(listLength - 2) + 2;
				
				currentNode = list.first;
				int currentPosition = 0;
				while(currentPosition < randomPosition) {
					currentNode = currentNode.next;
					currentPosition++;
				}
				oldRandom = currentNode;
			}
			
			list.reverse();
			
			// Testing the first node
			newFirst = list.first;
			
			boolean testFirst = asserter.assertEquals(newFirst.data, oldLast.data);
			//System.out.println("First position: " + testFirst);
			
			// Testing the last node
			currentNode = list.first;
			while(currentNode.next != null) {
				currentNode = currentNode.next;
			}
			newLast = currentNode;
			
			boolean testLast = asserter.assertEquals(newLast.data, oldFirst.data);
			//System.out.println("Last position: " + testLast);
			
			// Testing the random node
			if(listLength > 2) {
				currentNode = list.first;
				int currentPosition = 0;
				while(currentPosition < listLength - randomPosition) {
					currentNode = currentNode.next;
					currentPosition++;
				}
				newRandom = currentNode;
				
				boolean testRandom = asserter.assertEquals(newRandom.data, oldRandom.data);
				//System.out.println("Random position: " + testRandom);
				return testFirst && testLast && testRandom;
			}
			
			
			return testFirst && testLast;
		}
	}
	
	/**
	 * Tests if the list was actually reversed
	 * !!! DOESNT WORK BECAUSE IT ALSO REVERSES THE OLD LIST, DONT KNOW HOW TO FIX
	 * @param list
	 * @return boolean
	 */
//	public boolean testReverseListAll(LinkedList list) {
//		if(list.first == null) {
//			System.out.println("The list has no items");
//			return true;
//		}
//		else if(list.first.next == null) {
//			System.out.println("The list has only one item");
//			return true;
//		}
//		else {
//			LinkedList oldList = list;
//			Node currentNode;
//			int listLength = 0;
//			
//			list.reverse();
//			
//			currentNode = list.first;
//			while(currentNode != null) {
//				currentNode = currentNode.next;
//				listLength++;
//			}
//
//			int currentPosition = 0;
//			currentNode = list.first;
//			while(currentNode != null) {
//				int oldListPosition = 0;				
//				Node currentOldNode = oldList.first;
//				while(oldListPosition < listLength - 1 - currentPosition) {
//					currentOldNode = currentOldNode.next;
//					oldListPosition++;
//				}
//				Node oldNode = currentOldNode;
//				
//				if(currentNode.data != oldNode.data) {
//					return false;
//				}
//				
//				currentNode = currentNode.next;
//				currentPosition++;
//			}
//		}
//		
//		return true;
//	}
}