package com.ts.arraylist;

import java.util.*;

public class ArrayListSorter {

	public static void main(String args[]){
		   ArrayList<Student> studentlist = new ArrayList<Student>();
		   studentlist.add(new Student(223, "Chaitanya", 26));
		   studentlist.add(new Student(245, "Rahul", 24));
		   studentlist.add(new Student(209, "Ajeet", 32));

		   // Sorting Students using Comparable
		   Collections.sort(studentlist);

		   for(Student str: studentlist){
				System.out.println(str);
		   }

		   // Sorting Beer using Comparator
		   ArrayList<Beer> beerlist = new ArrayList<Beer>();
		   beerlist.add(new Beer("Bud", "Budweiser", 24));
		   beerlist.add(new Beer("Heni", "Hennessy", 35));
		   beerlist.add(new Beer("Adios", "AdiAdi", 12));
		   beerlist.add(new Beer("Dron", "Draft light", 46));
		   Collections.sort(beerlist);
		   
		   for(Beer br: beerlist){
				System.out.println(br);
		   }
		   
	     }

	
}
