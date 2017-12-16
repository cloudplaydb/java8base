package com.ts.arraylist;

import java.util.Comparator;

public class Beer implements Comparable<Beer>{

	private String beerName;
	private String beerDescription;
	private int quantity;

	public Beer(String beerName, String beerDescription, int quantity) {
		super();
		this.beerName = beerName;
		this.beerDescription = beerDescription;
		this.quantity = quantity;
	}

	public String getBeerName() {
		return beerName;
	}

	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}

	public String getBeerDescription() {
		return beerDescription;
	}

	public void setBeerDescription(String beerDescription) {
		this.beerDescription = beerDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int compareTo(Beer compareBeer) {

		int compareQuantity = ((Beer) compareBeer).getQuantity();

		//ascending order
		return this.quantity - compareQuantity;

		//descending order
		//return compareQuantity - this.quantity;

	}

	public static Comparator<Beer> BeerNameComparator
                          = new Comparator<Beer>() {

	    public int compare(Beer beer1, Beer beer2) {

	      String beerName1 = beer1.getBeerName().toUpperCase();
	      String beerName2 = beer2.getBeerName().toUpperCase();

	      //ascending order
	      return beerName1.compareTo(beerName2);

	      //descending order
	      //return beerName2.compareTo(beerName1);
	    }

	};
	
	@Override
    public String toString() {
        return "[ beerName=" + beerName + ", beerDescription=" + beerDescription + ", quantity=" + quantity + "]";
    }
}
