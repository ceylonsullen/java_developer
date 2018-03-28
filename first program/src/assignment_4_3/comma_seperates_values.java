package assignment_4_3;

import java.util.Scanner;

public class comma_seperates_values {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("please write several words seperated by commas");
		String s = input.nextLine();
		String[] strings;
		int count = 0, length = 0;
		for(int i = 0; i < s.length(); i++) {
			if (length > 0 && s.charAt(i) == ',') {
				length = 0;
				count++;	
			} else {
				length++;
				if (i == s.length() - 1) {
					count++;
				}
			} 
		}
		strings = new String[count];
		String current = "";
		int last = 0;
		outside: for (int j = 0; j < count; j++ ) {
			current = "";
			for(int i = last; i < s.length(); i++, last++) {
				if (length > 0 && s.charAt(i) == ',') {
					length = 0;
					strings[j] = current;
					last++;
					continue outside;
				} else {
					length++;
					current += s.charAt(i);
					if (i == s.length() - 1) {
						strings[j] = current;
						last++;
						continue outside;
					}
				} 
			}
		}
		
		for (String display : strings) {
			System.out.println(display);
		}

	}

}
