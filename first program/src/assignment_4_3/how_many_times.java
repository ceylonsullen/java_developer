package assignment_4_3;

import java.util.Scanner;
import java.util.Random;

public class how_many_times {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int[] first = new int[10];
		System.out.println("your values are: ");
		for (int i = 0; i < 10; i++) {
			first[i] = rand.nextInt(10);
			System.out.println(first[i]);
		}
		System.out.println("which value do you want to search for?");
		int value = input.nextInt();
		int count = 0;
		for (int current : first) {
			if (current == value) count++;
		}
		String result = "that value was found " + count + " time";
		if (count != 1) result += "s";
		System.out.println(result);

	}

}
