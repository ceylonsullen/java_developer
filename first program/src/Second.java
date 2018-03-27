import java.util.Scanner;

public class Second {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("what is your number grade?");
		int grade = input.nextInt();
		if (grade > 100 || grade < 0) {
			System.out.println("invalid grade");
		} else if (grade >= 90 ) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("c");
		} else if (grade >= 65) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
