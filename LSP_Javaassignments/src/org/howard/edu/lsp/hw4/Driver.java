package org.howard.edu.lsp.hw4;

public class Driver {

	public static void main(String[] args) {
		
		// Creating two IntegerSet objects: set1 and set2
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		
		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		// Printing the contents of set1 and set2
		System.out.println("Value of Set1 is: " + set1.toString());
		System.out.println("Value of Set2 is: " + set2.toString());
		
		// Printing the length of set1 and checking if set1 equals set2
		System.out.println("The length of Set1: " + set1.length());
		System.out.println("Does Set1 equal Set2: " + set1.equals(set2));
		
		// Printing whether set1 contains 2 and performing union operation on set2 and set1
		System.out.println("Does Set1 contain 2: " + set1.contains(2));
		set2.union(set1);
		System.out.println("The Value of Set2 after Union with Set1: " + set2.toString()); 
		
		// Calling the complement method on set1 and passing set2 as the argument
		set1.complement(set2);

		// Printing the output of the complement operation on set1
		System.out.println("The result after complement operation: " + set1.toString());
		
		// Printing the smallest value in set1
		try {
			System.out.println("The smallest value in Set1 is: " + set1.smallest());
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		
		// Printing the largest value in set1
		try {
			System.out.println("The largest value in Set1 is: " + set1.largest());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Performing intersection operation on set1 and set2
		set1.intersect(set2);
		System.out.println("The Value of Set1 after intersecting with Set2: " + set1.toString());
		
		// Removing value from set2 and finding the difference between set2 and set1
		set2.remove(3);
		System.out.println("The value of Set2 after removing 3: " + set2.toString());
		set2.diff(set1);
		System.out.println("The value of Set2 after finding the difference is: " + set2.toString());
		
		// Clearing set1 and checking if it is empty
		set1.clear();
		System.out.println("Is Set1 empty after clearing: " + set1.isEmpty());

	}

}
