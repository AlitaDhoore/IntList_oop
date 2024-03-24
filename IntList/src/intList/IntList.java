package intList;

import java.util.Arrays;

// 1. Define the API
//	  1.1. Write a line of infernal documentation for the class, explaining what an instance represents
//        (immutable abstractions/states, mutable abstractions)
//    1.2. Define the abstract state space (i.e. declaring the inspectors/getters)
//    1.3. Define the valid abstract state  spaces i.e. writing down the abstract state invariants,
//         either as @invar clauses in the JavaDoc for the class, or as @post clauses in the JavaDoc for the inspector(s)
//    1.4. Define and document the constructors and mutators
//
// 2. Implement the API
//    2.1. Define the representation
//         2.1.1. Define the raw concrete state space i.e. define the fields
//         2.1.2. Define the set of valid concrete states i.e. write down the representations invariants
//                i.e. concrete state invariants and private class invariants
//         2.1.3 Define the mapping from valid concrete states to abstract states i.e. implement the inspectors
//         2.1.4. Define sanity checks
//                2.1.4.1. The inspectors should never crash when called in a valid abstract space
//                2.1.4.2. The inspectors must map each valid concrete state to a valid abstract state
//         2.1.5 
public class IntList {
	
	/**
	 * Each instance of this class represents a sequence of integer values.
	 * 
	 * @invar | elements != null
	 * 
	 * @representationObject
	 */

	private int [] elements;
	public int [] getIntList() {
		return elements.clone();}
	
	/**
	 * 
	 * @post | result == getIntList().length
	 */
	
	public int getLength() {
		return elements.length;}
	
	/**
	 * @pre | 0 <= index && index < getLength()
	 * 
	 * @inspects | this
	 * 
	 * @post | result == getIntList()[index]
	 */	
	public int getElementAt(int index) {
		return elements[index];}
	/**
	 * Initializes the object with given array of integers.
	 * 
	 * @pre | initialList != null
	 * 
	 * @inspects | initialList
	 * 
	 * @post | Arrays.equals(getIntList(), initialList)
	 */
	
	public IntList(int [] initialList) {
		this.elements = initialList.clone();
	}
	
	/**
	 * Adds an integer to the back of the list.
	 * 
	 * @mutates | this
	 * 
	 * @post | getLength() == old(getLength()) + 1
	 * @post The existing elements are unchanged
	 * 		| Arrays.equals(getIntList(), 0, old(getLength()), old(getIntList()), 0, old(getLength()))
	 * @post | getIntList()[old(getLength())] == element
	 */
		
	public void addToIntList( int element) {
		elements = Arrays.copyOf(elements,  elements.length + 1);
		elements[elements.length-1] = element;}
	
	/**
	 * Removes an integer from the back of the list.
	 * 
	 * @pre | getLength() > 0
	 * 
	 * @mutates | this
	 * 
	 * @post | getLength() == old(getLength()) - 1
	 * @post | Arrays.equals(getIntList(), 0, old(getLength()), old(getIntList()), 0, old(getLength()))
	 */
	public void removeFromIntList( int [] newIntList) {
		elements = Arrays.copyOf(elements,  elements.length - 1);
	}
}
