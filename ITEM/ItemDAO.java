package ITEM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ItemDAO {
	public Item getItemById(int id) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", 
				"hussain2", 
				"password");
		String ALL = "SELECT * FROM item WHERE item_id = ?";
		PreparedStatement stmt = null;
		ResultSet result = null;
		stmt = conn.prepareStatement(ALL);
		stmt.setInt(1, id);
		result = stmt.executeQuery();
		Item item = new Item();
		if (result != null && result.next()) {
			item.setId(result.getInt(1));
			item.setName(result.getString(2));
			item.setQuantity(result.getInt(3));
			item.setPrice(result.getDouble(4));
		}
		return item;
	}
	
	public List<Item> getItemsCostingGreaterThan(double price) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", 
				"hussain2", 
				"password");
		String ALL = "SELECT * FROM item WHERE item_price > ?";
		PreparedStatement stmt = null;
		ResultSet result = null;
		stmt = conn.prepareStatement(ALL);
		stmt.setDouble(1, price);
		result = stmt.executeQuery();
		List<Item> items = new LinkedList<Item>();
		while (result != null && result.next()) {
			Item item = new Item();
			item.setId(result.getInt(1));
			item.setName(result.getString(2));
			item.setQuantity(result.getInt(3));
			item.setPrice(result.getDouble(4));
			items.add(item);
		}
		return items;
	}
	public List<Item> getItemsInStock() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", 
				"hussain2", 
				"password");
		String ALL = "SELECT * FROM item WHERE item_quantity_in_stock > 0";
		PreparedStatement stmt = null;
		ResultSet result = null;
		stmt = conn.prepareStatement(ALL);
		result = stmt.executeQuery();
		List<Item> items = new LinkedList<Item>();
		while (result != null && result.next()) {
			Item item = new Item();
			item.setId(result.getInt(1));
			item.setName(result.getString(2));
			item.setQuantity(result.getInt(3));
			item.setPrice(result.getDouble(4));
			items.add(item);
		}
		return items;
	}
}
