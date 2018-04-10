package HashMap;

import java.util.HashMap;
import java.util.Map;

public class menu {
	public static Map<String, Integer> createMenu() {
		Map<String, Integer> menu = new HashMap<String, Integer>();
		menu.put("turkey", 0);
		menu.put("ham", 0);
		menu.put("beef", 0);
		menu.put("salami", 0);
		menu.put("egg", 0);
		return menu;
	}
	public static void addItem(Map<String, Integer> menu, String item, int num) {
		if (menu.containsKey(item)) {
			int newQuantity = menu.get(item) + num;
			menu.put(item, newQuantity);
		} else menu.put(item, num);
	}
	public static String printCart(Map<String, Integer> menu) {
		String values = "";
		for (Map.Entry<String, Integer> i : menu.entrySet()) {
			values += i.getKey() + " " + i.getValue() + "\n";
		}
		return values;
	}
}
