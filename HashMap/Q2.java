package HashMap;

import java.util.Map;

public class Q2 {
	public static String iterator(Map<Integer, String> colors) {
		String values = "";
		for (int i = 1; i <= colors.size(); i++) {
			values += i + " " + colors.get(i) + "\n";
		}
		return values;
	}
	
	public static String forEach(Map<Integer, String> colors) {
		String values = "";
		for (Map.Entry<Integer, String> i : colors.entrySet()) {
			values += i.getKey() + " " + i.getValue() + "\n";
		}
		return values;
	}
}
