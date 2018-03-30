package two_d_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ticTacToe {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] board = {
				{' ', ' ', ' '},
				{' ', ' ', ' '},
				{' ', ' ', ' '}
		};
		boolean complete = false;
		boolean player1 = true;
		int turn = 0;
		while (complete != true && turn < 9) {
			char key;
			if (player1) {
				key = 'X';
			} else {
				key = 'O';
			}
			for (char[] row : board) {
				System.out.print("|");
				for (char spot : row) {
					System.out.print(spot + "|");
				}
				System.out.println();
			}
			System.out.println("which row would you like to put your mark?");
			int spotRow = input.nextInt();
			System.out.println("which column would you like to put your mark?");
			int spotColumn = input.nextInt();
			if(spotRow < 0 || spotRow > 2 || spotColumn < 0 || spotColumn > 2 
			   || board[spotRow][spotColumn] != ' ') {
				System.out.println("invalid spot try again");
				continue;
			}
			board[spotRow][spotColumn] = key;
			player1 = !player1;
			turn++;
			boolean win = false;
			if (Arrays.equals(new char[] {key, key,key}, board[spotRow])) {
				win = true;
			};
			boolean check = true;
			for (char[] row : board) {
				if (row[spotColumn] != key) {
					check = false;
				}
			}
			if (check) win = true;
			check = true;
			for (int i = 0; i < 3; i++) {
				if (board[i][i] != key) check = false;
			}
			if (check) win = true;
			if (board[2][0] == key && 
				board [1][1] == key && 
				board[0][2] == key ) win = true;
			if (win) {
				complete = true;
			}
		}
		for (char[] row : board) {
			System.out.print("|");
			for (char spot : row) {
				System.out.print(spot + "|");
			}
			System.out.println();
		}
		if (complete) {
			if (player1) {
				System.out.println("o wins!");
			} 
			else {
				System.out.println("x wins");
			}
		}
		System.out.println("game over");
	}

}
