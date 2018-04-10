package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Key_value_pairs {
	
	public static void main(String[] args) {
		Map<Integer, String> colors = new HashMap<Integer, String>();
		colors.put(1, "red");
		colors.put(2, "blue");
		colors.put(3, "green");
		colors.put(4, "orange");
		colors.put(5, "purple");
		System.out.println(colors.keySet());
		System.out.println(colors.values());
		colors.put(2, "pink");
		System.out.println(colors.keySet());
		System.out.println(colors.values());
		System.out.println(Q2.iterator(colors));
		System.out.println(Q2.forEach(colors));
		Map<String, Integer> cart;
		cart= menu.createMenu();
		System.out.println(menu.printCart(cart));
		menu.addItem(cart, "turkey", 2);
		menu.addItem(cart, "fish", 2);
		System.out.println(menu.printCart(cart));
		/**
		 * Q1
		 * 
		 * something changed because in a hashmap each key can only contain
		 * one unique value. if another value is set to the same key it 
		 * just over-writes.
		 */
	}

	
}
