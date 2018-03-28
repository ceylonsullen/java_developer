
public class assignment_4_2_nested_loops {

	public static void main(String[] args) {
		
		String result = "1.\n\r";
		int i, j;
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 8; j++) {
				result += "8";
			}
			result += "\n\r";
		}
		result += "2.\n\r";
		for (i = 0; i < 4; i++) {
			for (j = i; j < 4; j++) {
				result += "8";
			}
			result += "\n\r";
		}

		result += "3.\n\r";
		for (i = 0; i <= 5; i++) {
			for (j = i; j < 5; j++) {
				result += " ";
			}
			result += "8\n\r";
		}

		System.out.println(result);
	}
	
}
