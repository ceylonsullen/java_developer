package assignment_4_3;
import java.util.Random;

public class copy_an_array {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] second = new int[10];
		int[] first = new int[10];
		for (int i = 0; i < 10; i++) {
			first[i] = rand.nextInt(100) + 100;
		}
		int index = 0;
		for (int current : first) {
			second[index] = current;
			index++;
		}
		for (int current : first) {
			System.out.println(current);
		}
		for (int current : second) {
			System.out.println(current);
		}
		System.out.println();
	}

}
