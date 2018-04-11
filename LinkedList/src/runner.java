import java.util.LinkedList;

public class runner {

	public static void main(String[] args) {

		LinkedList<Integer> lk = new LinkedList<Integer>();
		Methods.append(lk, 1);
		System.out.println(lk);
		Methods.append(lk, 2);
		Methods.append(lk, 3);
		Methods.append(lk, 3);
		Methods.append(lk, 4);
		System.out.println(lk);
		System.out.println(Methods.iterate(lk));
		System.out.println(Methods.iterateAt(lk, 1));
		System.out.println(Methods.iterateReverse(lk));
		Methods.insertAt(lk, 2, 15);
		System.out.println(Methods.iterate(lk));
		Methods.insertLast(lk,  15);
		Methods.insertFirst(lk, 2);
		Methods.insertFirstLast(lk, 2, 15);
		System.out.println(Methods.iterate(lk));
		
	}

}
