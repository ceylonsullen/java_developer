package assignment_4_2;
import java.util.Scanner;

public class assignment_4_2_coordinates_on_a_plane {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("max X?");
		int max_X = input.nextInt();
		System.out.println("max Y?");
		int max_Y = input.nextInt();
		int tempX = 0, tempY;
		while(tempX <= max_X) {
			tempY = 0;
			while (tempY <= max_Y) {
				System.out.println("(" + tempX + "," + tempY++ + ")");
			}
			tempX++;
		}
		input.close();
	}

}
