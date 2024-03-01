package org.howard.edu.lsp.hw4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a set of integers.
 */
public class IntegerSet {

    /** The set elements. */
    private List<Integer> set = new ArrayList<Integer>();

    /** Default constructor. */
    public IntegerSet() {
        
    }

    /**
     * Constructor to initialize with an existing set.
     *
     * @param set the set
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the internal representation of the set.
     */
    public void clear() {
        set.clear();
    };

    /**
     * Returns the length of the set.
     *
     * @return the length of the set
     */
    public int length() {
        return set.size();
    }

    /**
     * Checks if two sets are equal.
     *
     * @param o the other IntegerSet to compare with
     * @return true if the sets are equal, false otherwise
     */
    public boolean equals(IntegerSet o) {
        // Implementation omitted
    }

    /**
     * Checks if the set contains a specific value.
     *
     * @param value the value to check
     * @return true if the set contains the value, false otherwise
     */
    public boolean contains(int value) {
        return set.contains(value);
    };    

    /**
     * Returns the largest item in the set.
     *
     * @return the largest item in the set
     * @throws Exception if the set is empty
     */
    public int largest() throws Exception {
        // Implementation omitted
    };

    /**
     * Returns the smallest item in the set.
     *
     * @return the smallest item in the set
     * @throws IntegerSetException if the set is empty
     */
    public int smallest() throws IntegerSetException {
        // Implementation omitted
    }

    /**
     * Adds an item to the set if it's not already present.
     *
     * @param item the item to add
     */
    public void add(int item) {
        // Implementation omitted
    }

    /**
     * Removes an item from the set if it's present.
     *
     * @param item the item to remove
     */
    public void remove(int item) {
        // Implementation omitted
    }; 

    /**
     * Computes the union of this set with another set.
     *
     * @param intSetb the other set to compute the union with
     */
    public void union(IntegerSet intSetb) {
        // Implementation omitted
    }

    /**
     * Computes the intersection of this set with another set.
     *
     * @param intSetb the other set to compute the intersection with
     */
    public void intersect(IntegerSet intSetb) {
        // Implementation omitted
    }; 

    /**
     * Computes the difference between this set and another set.
     *
     * @param intSetb the other set to compute the difference with
     */
    public void diff(IntegerSet intSetb) {
        // Implementation omitted
    }

    /**
     * Computes the complement of this set with respect to another set.
     *
     * @param intSetb the other set to compute the complement with
     */
    public void complement(IntegerSet intSetb) {
        // Implementation omitted
    }

    /**
     * Checks if the set is empty.
     *
     * @return true if the set is empty, false otherwise
     */
    boolean isEmpty() {
        return this.set.isEmpty();
    }
    
    /**
     * Returns a string representation of the set.
     *
     * @return a string representation of the set
     */
    public String toString() {
        return set.toString();
    }
}
