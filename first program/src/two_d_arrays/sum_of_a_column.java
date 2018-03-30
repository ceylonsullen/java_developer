package two_d_arrays;
import java.util.Random;
import java.util.Scanner;

public class sum_of_a_column {

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] nums = new int[3][3];
		for (int[] i : nums)  {
			for (int j = 0; j < i.length; j++) {
				i[j] = rand.nextInt(100);
				System.out.print(i[j] + " ");
			}
			System.out.println();
		}
		System.out.println("which column would you like to add up?");
		Scanner input = new Scanner(System.in);
		int column = input.nextInt();
		int sum = 0;
		for (int[] row : nums) {
			sum += row[column];
		}
		System.out.println("The sum of all numbers in the column is " + sum);
	}

}
