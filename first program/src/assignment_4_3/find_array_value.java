package assignment_4_3;

import java.util.Random;
import java.util.Scanner;

public class find_array_value {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int[] first = new int[10];
		for (int i = 0; i < 10; i++) {
			first[i] = rand.nextInt(100);
		}
		System.out.println("Your array is the following:");
		for (int current : first) {
			System.out.println(current);
		}
		System.out.println("Please search for a value");
		int term = input.nextInt();
		int index = 0;
		boolean found = false;
		for (int current : first) {
			if (current == term) {
				System.out.println("your term " + term + " is located at index " + index);
				found = true;
			}
			index++;
		}
		if (!found) System.out.println("your value was not found :(");
	}

}
