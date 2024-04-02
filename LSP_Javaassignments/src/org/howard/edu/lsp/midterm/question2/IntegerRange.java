package org.howard.edu.lsp.midterm.question2;

/**
 * The Range interface represents a range of integers.
 */
public interface Range {

    /**
     * Checks if the range contains the specified value.
     *
     * @param value the value to be checked
     * @return true if the value is within the range, false otherwise
     */
    public boolean contains(int value);

    /**
     * Checks if the range overlaps with another range.
     *
     * @param other the other range to be checked for overlap
     * @return true if the ranges overlap, false otherwise
     */
    public boolean overlaps(Range other);

    /**
     * Returns the number of integers in the range.
     *
     * @return the size of the range
     */
    public int size();
}

/**
 * The IntegerRange class represents a range of integers.
 */
public class IntegerRange implements Range {
    private int lowerBound;
    private int upperBound;

    /**
     * Constructs an IntegerRange with the specified lower and upper bounds.
     *
     * @param lowerBound the lower bound of the range
     * @param upperBound the upper bound of the range
     */
    public IntegerRange(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    /**
     * Checks if the range contains the specified value.
     *
     * @param value the value to be checked
     * @return true if the value is within the range, false otherwise
     */
 
    public boolean contains(int value) {
        return value >= lowerBound && value <= upperBound;
    }

    /**
     * Returns the number of integers in the range.
     *
     * @return the size of the range
     */
    public int size() {
        return (upperBound - lowerBound) + 1;
    }

    /**
     * Checks if this IntegerRange is equal to another IntegerRange.
     *
     * @param other the other IntegerRange to be compared
     * @return true if the two ranges are equal, false otherwise
     */
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        IntegerRange other = (IntegerRange) obj;
        return lowerBound == other.lowerBound && upperBound == other.upperBound;
    }

    
    public boolean overlaps(Range other) {
    	
        
        if (this.upperBound < other.getLowerBound() || this.lowerBound > ((IntegerRange) other).getUpperBound()) {
            return false; // No overlap
        } else {
            return true; // Overlaps
        }
    }


   

}
