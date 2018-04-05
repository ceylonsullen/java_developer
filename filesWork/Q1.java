package filesWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String location = "C:\\Users\\Students\\Desktop\\hello.txt";
		File file = new File(location);
		FileWriter writer;
		try {
			writer = new FileWriter(file, true);
			writer.write("Hello\n");
			writer.write("World\n");
			writer.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {

			Scanner sc = new Scanner(file);
			ArrayList<String> data = new ArrayList<String>();
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				data.add(line);
			}
			/**
			 * forwards
			 */
//			for (String l : data) {
//				System.out.println(l);
//			}
			/**
			 * backwards
			 */
			for (int i = data.size() - 1;i >= 0; i--) {
				String front = data.get(i);
				String reverse = "";
				for(int j = front. length() - 1; j >= 0; j--) {
				reverse = reverse + front. charAt(j); }
				System.out.println(reverse);
			}
			
		}
		catch (FileNotFoundException e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
	}

}
