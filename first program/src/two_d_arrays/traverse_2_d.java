package two_d_arrays;

import java.util.Scanner;



public class traverse_2_d {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] map = {
				{'X','o','o','o','o'},
				{'o','o','o','o','o'},
				{'o','o','o','o','o'},
				{'o','o','o','o','o'},
				{'o','o','o','o','o'}
		};

		int xRow = 0, xCol = 0;
		while (true) {
			System.out.println("Current Map: \n=========");
			for (char[] row : map) {
				for (char c : row) {
					System.out.print(c + " ");
				}
				System.out.println();
			}
			System.out.println("=========");
			System.out.println("write 'up', 'down', 'left' or 'right' to move");
			String direction = input.nextLine();
			int vert = 0, horz = 0;
			switch(direction) {
			case "left":
				horz = -1;
				break;
			case "right":
				horz = 1;
				break;
			case "down":
					vert = 1;
					break;
			case "up":
					vert = -1;
					break;
			}

			if (xRow + vert > map.length - 1 || xRow + vert < 0 || 
				xCol + horz < 0 || xCol + horz > map[0].length) {
				System.out.println("Error: You cannot move there from your current position\r\n" + 
						"Exiting program...");
				return;
			}
			map[xRow][xCol] = 'o';
			xRow += vert;
			xCol += horz;
			map[xRow][xCol] = 'X';
		}
	}
}
