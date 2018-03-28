import java.util.Scanner;

public class assignment_4_2_calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			String error = "";
			System.out.println("Provide an expression");
			double left = input.nextDouble();
			if (left == 0) {
				flag = false;
				System.out.println("exiting program");
				return;
			}
			String operator = input.next();
			double right = input.nextDouble();
			double result = 0;
			switch(operator) {
			case "+":
				result = left + right;
				break;
			case "-":
				result = left - right;
				break;
			case "*":
				result = left * right;
				break;
			case "/":
				result = left / right;
				break;
			default:
				error = "error: bad query";
			}
			if (error.length() > 0) {
				System.out.println(error);
			} else System.out.println(result);
		}
		input.close();

	}

}
