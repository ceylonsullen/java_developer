package interface_activity;

public class KidUsers implements LibraryUser {

	protected int age;
	protected String bookType;
	
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if (age < 12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else if (age > 12) {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBookType() {
		return bookType;
	}

	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if (bookType == "Kids") {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		} 
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}

}
