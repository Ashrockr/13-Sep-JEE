package com.capgemini.lab3_1;

import java.util.Scanner;

public class StringOperation {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int option;
		String str = "Ashish";
		do {
			System.out.print(
					  "\n__________________________________________________"
					+ "\n    String Operation                 "
					+ "\n__________________________________________________"
					+ "\n    Enter your option                             "
					+ "\n 1. Display the string                              "
					+ "\n 2. Add the string to itself                      "
					+ "\n 3. Replace odd positon with #                    "
					+ "\n 4. Remove duplicate characters in the string     "
					+ "\n 5. Change odd characters to uppercase            "
					+ "\n 6. Exit                                          "
					+ "\n__________________________________________________"
					+ "\n Option: "
					);
			option = scan.nextInt();
			switch (option) {
			case 1:
				displayString(str);
				break;
			case 2:
				str = addString(str);
				break;
			case 3:
				str = replaceOddPosition(str, '#');
				break;
			case 4:
				str = removeDuplicate(str);
				break;
			case 5:
				str = changeOddToUpper(str);
				break;
			case 6:
				exit();
				break;
			default:
				System.out
				.println("\nPlease select the correct option (1-6) only.");
				break;
			}
		} while (true);

	}

	private static String changeOddToUpper(String str) {
		StringBuilder strB = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (i % 2 != 0) {
				strB.append(String.valueOf(c).toUpperCase());
			} else {
				strB.append(String.valueOf(c));
			}
		}
		return strB.toString();
	}

	private static String removeDuplicate(String str) {
		String strUnique = "";
		for (int i = 0; i < str.length(); i++) {
			Boolean found = false;
			for (int j = 0; j < strUnique.length(); j++) {
				if (str.charAt(i) == strUnique.charAt(j)) {
					found = true;
					break;
				}
			}
			if (!found) {
				strUnique = strUnique.concat(String.valueOf(str.charAt(i)));
			}
		}
		return strUnique;

	}

	private static String replaceOddPosition(String str, char c) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 != 0) {
				str1=str1.concat(String.valueOf(c));
			} else {
				str1=str1.concat(String.valueOf(str.charAt(i)));
			}
		}
		return str1;
	}

	private static String addString(String str) {
		str = str.concat(str);
		return str;
	}

	private static void displayString(String str) {
		System.out.println(" String  : " + str);
	}

	private static void exit() {
		System.out.println(" Exitted!!");
		scan.close();
		System.exit(1);

	}

}
