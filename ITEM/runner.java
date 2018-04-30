package ITEM;

import java.sql.SQLException;
import java.util.List;

public class runner {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ItemDAO items = new ItemDAO();
		System.out.println(items.getItemById(3).getName());
		List<Item> greater = items.getItemsCostingGreaterThan(2.20);
		for (Item i : greater) {
			System.out.println(i.getName());
		}
		
		List<Item> stock = items.getItemsInStock();
		for (Item i : stock) {
			System.out.println(i.getName());
		}
	}

}
