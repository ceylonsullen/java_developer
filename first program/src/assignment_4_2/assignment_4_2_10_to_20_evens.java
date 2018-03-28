package assignment_4_2;
import java.util.Scanner;

public class assignment_4_2_10_to_20_evens {

	public static void main(String[] args) {
		// increment 2, continue on 16
		int i;
		for (i = 10; i <= 20; i += 2) {
			if (i == 16) {
				continue;
			} else {
				System.out.println("skip 2: " + i);
			}
		}
		
		// increment 1, continue on odds and 16
		
		for (i = 10; i <= 20; i++) {
			if (i % 2 > 0) {
				continue;
			} else if (i == 16) {
				continue;
			} else {
				System.out.println("continue: " + i);
			}
		}
		
		// endless loop, continues above, plus break on 20;
		i = 10;
		while(true) {
			if (i % 2 > 0) {
				i++;
				continue;
			} else if (i == 16) {
				i++;
				continue;
			} else if (i > 20){
				i++;
				break;
			} else {
				System.out.println("endless: " + i);
			}
			i++;
		}
	}

}
