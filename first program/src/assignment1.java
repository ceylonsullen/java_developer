import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		System.out.println("which program would you like to run?"
				+ "\n1: Dogs and cats"
				+ "\n2: Legal age "
				+ "\n3: Cars or buses"
				+ "\n4: Specific legal"
				+ "\n5: Day of the week"
				+ "\n6: Space Weight");
		Scanner input = new Scanner(System.in);
		int menu = input.nextInt();
		if (menu == 1) {
			System.out.println("number of people?");
			int people = input.nextInt(); // 
			System.out.println("number of cats?");
			int cats = input.nextInt(); // 
			System.out.println("number of dogs?");
			int dogs = input.nextInt();
			// if there are less people than cats, report it
			if (people < cats) {
				System.out.println("Too many cats! The world is doomed!");
			}
			// if there are more people than cats, also report it
			if (people > cats) {
				System.out.println("Too few cats! The world is saved for another day!");
			}
			// if there are more dogs than people report it
			if (people < dogs) {
				System.out.println("The world is drooled on!");
			}
			// if there are more people than dogs report it
			if (people > dogs) {
				System.out.println("The world is dry!");
			}

		} else if (menu == 2) {
			System.out.println("howdy! what's you age?");
			int age = input.nextInt();
			if (age < 16) {
				System.out.println("You can't drive.");
			}
			if (age < 18) {
				System.out.println("You can't vote.");
			}
			if (age < 25) {
				System.out.println("You can't rent a car");
			}
			if (age >= 25) {
				System.out.println("You can do anything that's legal.");
			}
		} else if (menu == 3) {
			System.out.println("how many people?");
			int people = input.nextInt();
			System.out.println("how many cars?");
			int cars = input.nextInt();
			System.out.println("how many buses?");
			int buses = input.nextInt();
			if (cars > people ) {
				System.out.println("We should take the cars.");
			} else if (cars < people) {
				System.out.println("We should not take the cars.");
			} else {
				System.out.println("We can't decide.");
			}
			if (buses > cars) {
				System.out.println("That's too many buses.");
			} else if (cars > buses) {
				System.out.println("Maybe we should take the buses.");
			} else {
				System.out.println("We still can't decide.");
			}
			if ( people > buses) {
				System.out.println("Alright, let's just take the buses.");
			} else {
				System.out.println("Let's just take the cars.");
			}
			
			// if and else are deciding which lines of code to run
			// if else is removed from else if makes "we can't decide" come up
			// when the first if statement passes
		} else if (menu == 4) {
			System.out.println("what is your age?");
			int age = input.nextInt();
			switch(age) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			case 13:
			case 14:
			case 15:
				System.out.println("You can't drive.");
				break;
			case 16:
			case 17:
				System.out.println("You can't vote.");
				break;
			case 18:
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
				System.out.println("You can't rent a car.");
				break;
			default:
				System.out.println("You can do anything that's legal");
				
			
			}
		} else if (menu == 5) {
			System.out.println("enter a number 1 to 7");
			int day = input.nextInt();
			String s;
			switch(day) {
			case 1:
				s = "Monday";
				break;
			case 2:
				s = "Tuesday";
				break;
			case 3:
				s = "Wednesday";
				break;
			case 4:
				s = "Thursday";
				break;
			case 5:
				s = "Friday";
				break;
			case 6:
				s = "Saturday";
				break;
			case 7:
				s = "Sunday";
				break;
			default:
				s = "Error";
			}
			System.out.println(day + " is " + s + "!");
		} else if (menu == 6) {
			System.out.println("What is your earth weight?");
			double earthWeight = input.nextDouble();
			double calcWeight;
			System.out.println("I have information for the following planets:\r\n" + 
					"1. Venus\r\n" + 
					"2. Mars\r\n" + 
					"3. Jupiter\r\n" + 
					"4. Saturn\r\n" + 
					"5. Uranus\r\n" + 
					"6. Neptune\r\n" + 
					"Which planet are you visiting? ");
			int planet = input.nextInt();
			switch (planet) {
			case 1:
				calcWeight = 0.78 * earthWeight;
				break;
			case 2:
				calcWeight = 0.39 * earthWeight;
				break;
			case 3:
				calcWeight = 2.65 * earthWeight;
				break;
			case 4:
				calcWeight = 1.17 * earthWeight;
				break;
			case 5:
				calcWeight = 1.05 * earthWeight;
				break;
			case 6:
				calcWeight = 1.23 * earthWeight;
				break;
			default:
				calcWeight = 0;
			}
			if (calcWeight > 0) {
				System.out.println("Your weight would be " + calcWeight + " pounds on that planet");
			} else {
				System.out.println("not a valid response");
			}
		} 
		input.close();
	}
}
