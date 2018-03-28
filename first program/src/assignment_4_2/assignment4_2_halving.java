package assignment_4_2;
import java.util.Scanner;

public class assignment4_2_halving {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("what's the number?");
		int num = input.nextInt();
		if (num < 1) {
			System.out.println("HEY! That's against the rules." );
			input.close();
			return;
		}
		while (num > 1) {
			if (num % 2 == 0) {
				num /= 2;
				System.out.println(num);
			} else {
				num = (num + 1) / 2;
				System.out.println(num);
			}
		}
		input.close();
	}
}
