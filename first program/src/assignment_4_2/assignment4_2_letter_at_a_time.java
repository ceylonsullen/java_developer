package assignment_4_2;
import java.util.Scanner;

public class assignment4_2_letter_at_a_time {

	public static void main(String[] args) {
		System.out.println("write something!");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		for (int i = 0; i < s.length(); i++) {
			System.out.println(i + ": '" + s.charAt(i) + "'");
		}
		input.close();
	}

}
