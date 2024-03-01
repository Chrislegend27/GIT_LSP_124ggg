package org.howard.edu.lsp.hw4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegerSet  {
	private static final boolean True = false;
	// Store the set elements in an ArrayList
	private List<Integer> set = new ArrayList<Integer>();
	// Default Constructor
	public IntegerSet() {
		
	}

	// Constructor if you want to pass in already initialized
	public IntegerSet(ArrayList<Integer> set) {
		this.set = set;
	}

	// Clears the internal representation of the set
	public void clear() {
		set.clear();
	};

// Returns the length of the set
	public int length() {
		return set.size();
		
	}; // returns the length

/*
 * Returns true if the 2 sets are equal, false otherwise;
 * Two sets are equal if they contain all of the same values in ANY order.  This overrides
 * the equal method from the Object class.
 * Unfinished
*/
	public boolean equals(IntegerSet o) {
	    if (set.size() != o.length()) {
	        return false;
	    }
	    for (int item : o.set) {
	        if (!set.contains(item)) {
	            return false;
	        }
	    }
	    return true;
	}
// Returns true if the set contains the value, otherwise false
	public boolean contains(int value) {
		return set.contains(value);
	};    

// Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	public int largest() throws Exception {
	    if (set.isEmpty()) {
	        throw new Exception("Set is empty");
	    }
	    return Collections.max(set);
	};
	

// Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	public int smallest() throws IntegerSetException {
		if (set.isEmpty()) {
		throw new IntegerSetException("Set is empty");
		}
		int smallest =set.get(0);
		for (int element : set) {
		if (element < smallest) {
		smallest = element;
		}
		}
		return smallest;
		}
	
		// Adds an item to the set or does nothing it already there	
		public void add(int item) {
		    if (!set.contains(item)) {
		        set.add(item);
		    }
		}

	// Removes an item from the set or does nothing if not there
	public void remove(int item) {
		set.remove(Integer.valueOf(item));
	}; 

// Set union
	public void union(IntegerSet intSetb) {
	    for (int num : intSetb.set) {
	        if (!set.contains(num)) {
	            set.add(num);
	        }
	    }
	}


// Set intersection, all elements in s1 and s2
	public void intersect(IntegerSet intSetb) {
		set.retainAll(intSetb.set);
	}; 

// Set difference, i.e., s1 –s2
	public void diff(IntegerSet intSetb) {
	    set.removeAll(intSetb.set);
	}

	public void complement(IntegerSet intSetb) {
	    // Assuming 'set' is a List<Integer> representing the current set (s1)
	    // and intSetb is the set we're finding the complement against.

	    List<Integer> complement = new ArrayList<>();
	    // Iterate over elements in intSetb
	    for (Integer element : intSetb.set) {
	        // If the element is not contained in the current set, add it to the complement
	        if (!set.contains(element)) {
	            complement.add(element);
	        }
	    }
	    // Update the current set to the complement
	    set = complement;
	}


// Returns true if the set is empty, false otherwise
	boolean isEmpty() {
		return this.set.size() == 0;
	}
	
// Return String representation of your set.  This overrides the equal method from 
// the Object class.

	public String toString() {
	    return set.toString();
	}	// return String representation of your set
	}