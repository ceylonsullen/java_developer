import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class startSmall {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>(8);
		colors.add("red");
		colors.add("white");
		colors.add("blue");
		colors.add("black");
		colors.add("gold");
		ArrayList<String> colors2 = new ArrayList<String>(8);
		colors2.add("red");
		colors2.add("white");
		colors2.add("blue");
		colors2.add("black");
		colors2.add("gold");
		System.out.println(colors);
		//q2
		iterate(colors);
		//Q3
		updating(colors, 4, "magenta");
		iterate(colors);
		//Q4
		removing(colors, 2);
		iterate(colors);
		//q5
		System.out.println(searching(colors, "magenta"));
		System.out.println(searching(colors, "orange"));
		//q6
		System.out.println(sorting(colors));
		//q7
		System.out.println(reversing(colors));
		//q8
		System.out.println("hello" + copying(colors, new ArrayList<String>()));
		//q9
		System.out.println(comparing(colors, colors2));
		//q10
		System.out.println(appending(colors, colors2));
		//q11
		System.out.println(looping(colors));
		//q12
		Integer[] nums = {0,1,2,3,4,5,6};
		System.out.println(converting(nums));
	}
	//Q2
	public static void iterate(ArrayList<String> s) {
		for (String c : s ) {
			System.out.printf("Today's Color is %s!\n", c);
		}
	}
	//Q3
	public static void updating(ArrayList<String> s, int i, String e) {
		if (i < s.size()) {
			s.set(i, e);
		}
	}
	//Q4
	public static void removing(ArrayList<String> s, int i) {
		if (i < s.size()) {
			// String store = "";
			// for (int j = i; j < s.size(); j++)
			s.remove(i);
		}
	}
	//Q5
	public static boolean searching(ArrayList<String> s, String e) {
		for (String c : s) {
			if (c.equals(e)) return true;
		}
		return false;
	}
	//q6
	public static ArrayList<String> sorting(ArrayList<String> s) {
		Collections.sort(s);
		return s;
	}
	//q7
	public static ArrayList<String> reversing(ArrayList<String> s) {
		Collections.reverse(s);
		return s;
	}

	//q8
	public static ArrayList<String> copying(ArrayList<String> s, ArrayList<String> p) {
		p = new ArrayList<String>(s);
		removing(s, 2);
		return p;
	}
	
	//q9
	public static ArrayList<String> comparing(ArrayList<String> s, ArrayList<String> p) {
		
		Set<String> source = new HashSet<String>(s);
		source.retainAll(p);

		return new ArrayList<String>(source);
		
	}
	
	//q10
	public static ArrayList<String> appending(ArrayList<String> s, ArrayList<String> p) {
		
		s.addAll(p);
		return s;
	}
	
	//q11
	public static String looping(ArrayList<String> s) {
		
		String v = "";
		for (String c : s) {
			v += c += "\n";
		}
		return v;
		
	}
	//q12
	
	//q9
	public static ArrayList<Object> converting(Object[] t) {
		
		ArrayList<Object> here = new ArrayList<Object>();
		for ( Object i : t) {
			here.add(i);
		}
		return here;
	}
}
