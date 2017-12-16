package com.ts.arraylist;

import java.util.ArrayList;

public class ArrayListBeginner {

	public static void main(String args[]) {

		/*
		 * Creation of ArrayList: I'm going to add Stringelements so I made it
		 * of string type
		 */
		ArrayList<String> obj = new ArrayList<String>();

		/* This is how elements should be added to the array list */
		obj.add("Iron");
		obj.add("Copper");
		obj.add("Silver");
		obj.add("Mercury");
		obj.add("Lead");

		/* Displaying array list elements */
		System.out.println("Currently the array list has following elements:"
				+ obj);

		/* Add element at the given index */
		obj.add(0, "Selenium");
		obj.add(1, "Cadmium");

		/* Remove elements from array list like this */
		obj.remove("Lead");
		obj.remove("Mercury");

		System.out.println("Current array list is:" + obj);

		/* Remove element from the given index */
		obj.remove(1);

		System.out.println("Current array list is:" + obj);
	}

	// Methods in Arraylist class

	// obj.add("Iron");adds an object to the arraylist at last position.

	// obj.add(2, "Iron");adds the object to the array list at the given index.

	// obj.remove("Iron"); Removes the object from the ArrayList.

	// obj.remove(2); Removes element from a given index.

	// obj.set(2, "Silver");replaces the element present at the specified index
	// with the new object.

	// int pos = obj.indexOf("Silver"); Gives the index of the object. If the
	// element is not found in the list then this method returns the value -1.\

	// String str= obj.get(2); returns the object of list which is present at
	// the specified index.

	// int numberofitems = obj.size();gives the size of the ArrayList

	// obj.contains("Iron"); checks whether the given object o is present in the
	// array list if its there then it returns true else it returns false.

	// obj.clear();  used for removing all the elements of the array list in one go. 
	
	

}
