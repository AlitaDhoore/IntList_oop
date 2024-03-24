package intList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntList_test {

	@Test
	void test() {
		int[] list = new int[] {1, 2, 3};
		IntList2 myList = new IntList2(list);
		assertArrayEquals(new int[] {1, 2, 3}, myList.getElements());
		
		myList.addElement(4);
		assertArrayEquals(new int[] {1, 2, 3, 4}, myList.getElements());
		
		myList.removeElement();
		assertArrayEquals(new int[] {1, 2, 3}, myList.getElements());
		
	}

}
