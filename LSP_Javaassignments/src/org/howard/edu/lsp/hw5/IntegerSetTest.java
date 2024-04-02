package org.howard.edu.lsp.hw5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.howard.edu.lsp.hw5.IntegerSet;

import org.junit.jupiter.api.*;

public class IntegerSetTest {
    private IntegerSet test_set;
    private IntegerSet test_set2;

    @BeforeEach
    public void setUp() {
        test_set = new IntegerSet();
        test_set.add(1);
        test_set.add(2);
        test_set.add(3);

        test_set2 = new IntegerSet();
        test_set2.add(1);
        test_set2.add(2);
        test_set2.add(3);
    }
    
    @Test
    @DisplayName("Test case for Add")
    public void testAdd() {
        test_set.add(4);
        assertEquals(4, test_set.length());
    }
    
    @Test
    @DisplayName("Test case for Length")
    public void testLength() {
        assertEquals(3, test_set.length());
    }
    
    @Test
    @DisplayName("Test case for Clear")
    public void testClear() {
        test_set.clear();
        assertEquals(0, test_set.length());
    }

    @Test
    @DisplayName("Test case for Equals")
    public void testEquals() {
        assertEquals(true, test_set.equals(test_set2));
    }
    
    @Test
    @DisplayName("Test case for Contains")
    public void testContains() {
        assertEquals(true, test_set.contains(1));
        assertEquals(true, test_set.contains(2));
        assertEquals(true, test_set.contains(3));

    }
    
    @Test
    @DisplayName("Test case for Largest")
    public void testLargest() throws Exception {
        assertEquals(3, test_set.largest());
        assertEquals(3, test_set2.largest());

    }
    
    @Test
    @DisplayName("Test case for Smallest")
    public void testSmallest() throws Exception {
        assertEquals(1, test_set.smallest());
        assertEquals(1, test_set2.smallest());


    }
    
    
    @Test
    @DisplayName("Test case for Remove")
    public void testRemove() {
        test_set.remove(3);
        assertEquals(2, test_set.length());
    }
    
    @Test
    @DisplayName("Test case for isEmpty")
    public void testEmpty() {
        assertEquals(false, test_set.isEmpty());
        test_set.clear();
        assertEquals(true, test_set.isEmpty());
    }
    
    @Test
    @DisplayName("Test case for Union")
    public void testUnion() {
        IntegerSet expectedSet = new IntegerSet();
        
        expectedSet.add(1);
        expectedSet.add(2);
        expectedSet.add(3);
        // Assuming union adds elements from both sets
        test_set.union(test_set2); // Perform the union operation
        assertEquals(expectedSet.toString(), test_set.toString());

    }
    
    @Test
    @DisplayName("Test case for Intersect")
    public void testIntersect() {
        IntegerSet expectedSet = new IntegerSet(); //Create empty set for comparison
        
        
        expectedSet.add(1);
        expectedSet.add(2);
        expectedSet.add(3);
        
        test_set.intersect(test_set2);
        //Should be empty because their is nothing different
        assertEquals(expectedSet.toString(), test_set.toString());   
        
    }
    
    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet expectedSet = new IntegerSet(); //Create empty set for comparison
        
        
        expectedSet.add(1);
        expectedSet.add(2);
        expectedSet.add(3);
        
        test_set.intersect(test_set2);
        //Should be empty because their is nothing different
        assertEquals(expectedSet.toString(), test_set.toString());   
        
    }
    
    
    @Test
    @DisplayName("Test case for complement")
    public void testDifference() {
        IntegerSet expectedSet = new IntegerSet(); //Create empty set for comparison

        
        test_set.diff(test_set2);
        //Should be empty because their is nothing different
        assertEquals(expectedSet.toString(), test_set.toString());   
        
    }
    

    @Test
    @DisplayName("toString")
    public void testToString() {
        // Define the expected string representation
        String expectedString = "[1, 2, 3]";
        
        // Call the toString() method and compare with the expected string
        assertEquals(expectedString, test_set.toString());
    }
}
    

    
    
    
    
    
    



