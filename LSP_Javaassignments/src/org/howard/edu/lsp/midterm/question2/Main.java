package org.howard.edu.lsp.midterm.question2;

public class Main {
    public static void main(String[] args) {
        // Create IntegerRange objects for testing
        IntegerRange range1 = new IntegerRange(5, 10);
        IntegerRange range2 = new IntegerRange(8, 15);
        IntegerRange range3 = new IntegerRange(1, 4);
        
        // Test contains method
        System.out.println("Range 1 contains 7: " + range1.contains(7)); // true
        System.out.println("Range 1 contains 15: " + range1.contains(15)); // false

        // Test overlaps method
        System.out.println("Range 1 overlaps with Range 2: " + range1.overlaps(range2)); // true
        System.out.println("Range 1 overlaps with Range 3: " + range1.overlaps(range3)); // false

        // Test size method
        System.out.println("Size of Range 1: " + range1.size()); // 6

        // Test equals method
        IntegerRange range4 = new IntegerRange(5, 10);
        System.out.println("Range 1 equals Range 4: " + range1.equals(range4)); // true
    }
}
