package week5day2;

public class InheritanceActivity {

	public static void main(String[] args) {
		Manager manny = new Manager(126534, "Peter", "Chennai India", 237844, 65000);
		manny.calculateSalary();
		manny.calculateTransportAllowance();
		Trainee troy = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		troy.calculateSalary();
		troy.calculateTransportAllowance();
	}
	
	

}
