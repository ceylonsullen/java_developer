package interface_activity;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidUsers kim = new KidUsers();
		kim.setAge(10);
		kim.registerAccount();
		kim.setAge(18);
		kim.registerAccount();
		kim.setBookType("Kids");
		kim.requestBook();
		kim.setBookType("Fiction");
		kim.requestBook();
		
		AdultUser dil = new AdultUser();
		dil.setAge(5);
		dil.registerAccount();
		dil.setAge(23);
		dil.registerAccount();
		dil.setBookType("Kids");
		dil.requestBook();
		dil.setBookType("Fiction");
		dil.requestBook();
	}

}
