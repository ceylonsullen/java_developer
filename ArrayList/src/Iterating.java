import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors = new ArrayList<String>(8);
		colors.add("red");
		colors.add("white");
		colors.add("blue");
		colors.add("black");
		colors.add("gold");
		iterate(colors);
	}
	
	public static void iterate(ArrayList<String> s) {
		for (String c : s ) {
			System.out.printf("Today's Color is %s!\n", c);
		}
	}

}
