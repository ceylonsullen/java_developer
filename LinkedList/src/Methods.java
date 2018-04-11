import java.util.Deque;
import java.util.LinkedList;

public class Methods {
	public static <T> void append(LinkedList<T> dq, T i) {
		dq.addLast(i);
	}
	
	public static <T> String iterate(LinkedList<T> dq) {
		String result = "";
		for (int i = 0; i < dq.size(); i++) {
            result += dq.get(i) + "\n";
        }
		return result;
	}
	
	public static <T> String iterateAt(LinkedList<T> dq, int j) {
		String result = "";
		for (int i = j; i < dq.size(); i++) {
            result += dq.get(i) + "\n";
        }
		return result;
	}
	
	public static <T> String iterateReverse(LinkedList<T> dq) {
		String result = "";
		for (int i = 0; i < dq.size(); i++) {
            result += dq.get(dq.size() - i - 1) + "\n";
        }
		return result;
	}
	
	public static <T> void insertAt(LinkedList<T> dq, int j, T t) {
		dq.add(j, t);
	}
	
	public static <T> void insertFirstLast(LinkedList<T> dq, T f, T l) {
		dq.addFirst(f);
		dq.addLast(l);
	}
	
	public static <T> void insertFirst(LinkedList<T> dq, T f) {
		dq.addFirst(f);
	}
	
	public static <T> void insertLast(LinkedList<T> dq, T l) {
		dq.addLast(l);
	}
	
}
