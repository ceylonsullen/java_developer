/**
 * Auto Generated Java Class.
 */
public class Divisible_by {
    
    public static boolean isEven(int n) {
        if (n % 2 == 0) return true;
        else return false;
    }
    public static boolean isDivisibleBy3(int n) {
        if (n % 3 == 0) return true;
        else return false;
    }
    public static void main(String[] args) { 
        String s;
        for (int i = 1; i <= 20; i++) {
            s = "" + i;
            if (isEven(i)) s += "<";
            if (isDivisibleBy3(i)) s += "=";
            System.out.println(s);
        }
    }
    
    /* ADD YOUR CODE HERE */
    
}
