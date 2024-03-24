package intList;

import java.util.Arrays;

/**
 * An instance represents an array of elements
 */
public class IntList2 {
//We care about the content of the states and not necessarily about the identity because an array is always 
//newly created, so we use '@creates'

	/**
	 * 
	 * @invar | elements != null
	 * 
	 * @representationObject
	 * 
	 */
	private int[] elements;
	
	/**
	 * 
	 * @creates | result
	 * 
	 * @post | result != null
	 * 
	 */

	public int [] getElements() {
		return elements.clone();		
	}
	
	/**
	 * Initializes the object with an array of integers.
	 * 
	 * @pre | initialElements != null
	 * 
	 * @inspects | initialElements
	 * 
	 * @post | Arrays.equals(getElements(), initialElements)
	 * 
	 */
	public IntList2(int [] initialElements) {
		this.elements = initialElements.clone();
	}
	
	/**
	 * 
	 * @mutates | this
	 * 
	 * @post | Arrays.equals(getElements(), 0, old(getElements()).length, old(getElements()), 0, old(getElements()).length)
	 * @post | getElements().length == old(getElements()).length + 1
	 * @post | getElements()[getElements().length-1] == element
	 * 
	 */
	public void addElement(int element) {
		elements = Arrays.copyOf(elements, elements.length + 1);
		elements[elements.length-1] = element;
	}
	
	/**
	 * 
	 * @pre | getElements() != null
	 * 
	 * @mutates | this
	 * 
	 * @post | Arrays.equals(getElements(), 0, getElements().length, old(getElements()), 0, getElements().length)
	 * @post | getElements().length == old(getElements()).length - 1 
	 * 
	 */
	public void removeElement() {
		elements = Arrays.copyOf(elements, elements.length - 1);
	}
}
