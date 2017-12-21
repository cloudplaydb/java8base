package com.ts.string;

import java.util.ArrayList;
import java.util.List;

public class StringSplitReverseAlternate {

	public static void main(String[] args) {

		String ip = "abcdefghijk";
		int b = 3;
		List<String> strList = splitToXChar(ip, b);
		String revAltString = reverseAlternateString(strList, b);
		System.out.println(revAltString);
		// String expectedOutput = "cbadefihgjk";

	}

	private static String reverseAlternateString(List<String> strList, int x) {
		StringBuilder strB = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		String str;
		for (int i = 0; i < strList.size(); i++) {
			str = strList.get(i);
			if (i % 2 == 0) {
				temp.append(str);
				temp.reverse();
				strB.append(temp.toString());
				temp = new StringBuilder();

			} else {
				strB.append(str);
			}
		}
		return strB.toString();
	}

	private static List<String> splitToXChar(String text, int x) {
		List<String> parts = new ArrayList<>();
		int length = text.length();
		for (int i = 0; i < length; i += x) {
			parts.add(text.substring(i, Math.min(length, i + x)));
		}
		return parts;
	}

}