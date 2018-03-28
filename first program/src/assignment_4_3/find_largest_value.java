package assignment_4_3;

import java.util.Random;

public class find_largest_value {

	public static void main(String[] args) {

		Random rand = new Random();
		int[] first = new int[10];
		System.out.println("your numbers are: ");
		for (int i = 0; i < 10; i++) {
			first[i] = rand.nextInt(1000) - 500;
			System.out.println(first[i]);
		}
		
		int largest = first[0];
		int index = 0;
		int largestIndex = 0;
		for (int current : first ) {
			if (current > largest) {
				largest = current;
				largestIndex = index;
			}
			index++;
		}
		System.out.println("largest number is " + largest + " located at index " + largestIndex);
	}

}
