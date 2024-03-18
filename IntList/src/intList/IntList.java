package intList;

public class IntList {
	
	/**
	 * Each instance of this class represents a sequence of integer values.
	 * 
	 * @invar | array != null
	 */

	public int [] getIntList() {
		throw new RuntimeException("Not yet implemented.");}
	
	/**
	 * Initializes the object with given array of integers.
	 * 
	 * @throws IllegalArgumentException | initialList != null
	 * 
	 * @post | initialList == getIntList()
	 */
	public IntList(int [] initialList) {
		if (initialList == null)
			throw new IllegalArgumentException("Not a valid list of integers.");
		throw new RuntimeException("Not yet implemented.");
	}
	
	/**
	 * Creates a list of integers with values given by the client.
	 * 
	 * @throws IllegalArgumentException | newIntList != null
	 * @mutates | this
	 * 
	 * @post | getIntList() == newIntList
	 */
	public void setIntList( int [] newIntList) {
		throw new RuntimeException("Not yet implemented.");}
	
	//public void retrieveIntList( int [] newIntList) {
	//	throw new RuntimeException("Not yet implemented.");}
	
	/**
	 * Adds an integer to the back of the list.
	 * 
	 * @throws IllegalArgumentException | newIntList != null
	 * @mutates | this
	 * 
	 * @post | newIntList.length == old(newIntList).length + 1
	 * @post | newIntList[newIntList.length] == lastInt
	 */
		
	public void addToIntList( int [] newIntList, int lastInt) {
		throw new RuntimeException("Not yet implemented.");}
	
	/**
	 * Removes an integer from the back of the list.
	 * 
	 * @throws IllegalArgumentException | newIntList != null
	 * @mutates | this
	 * 
	 * @post | newIntList.length == old(newIntList).length - 1
	 * @post | newIntList[newIntList.length] == old(newIntList)[old(newIntList).length-1]
	 */
	public void removeFromIntList( int [] newIntList) {
		throw new RuntimeException("Not yet implemented.");}
}
