package com.ts.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayInitializer {

	public static void main(String [] args){
		String str[] = new String[5];
		str[0] = "q";
		str[1] = "d";
		str[2] = "r";
		str[3] = "v";
		str[4] = "3";
		
		String str1[] = {"v.1.2.3","v.1.3.4","v.1.0.0"};
		
		List<String> strList = Arrays.asList(str1);
		Collections.sort(strList);
		
		for(int i = 0; i < strList.size(); i++){
			System.out.println(strList.get(i));
		}
		
		List<String> strList1 = Arrays.asList(str);
		Collections.sort(strList1);
		
		for(int i = 0; i < strList1.size();i++){
			System.out.println(strList1.get(i));
		}
		
		Integer[] intarr = new Integer[3];
		intarr[0] = 23;
		intarr[1] = 39;
		intarr[2] = 11;
		
		List<Integer> intList = Arrays.asList(intarr);
		Collections.sort(intList);
		
		for(int i = 0; i < intList.size(); i++){
			System.out.println(intList.get(i));
		}
	}
}
