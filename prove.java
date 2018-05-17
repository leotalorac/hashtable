import java.util.Scanner;

/**
 * prove
 */
public class prove {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in,"iso-8859-1");
        Scanner s2 = new Scanner(System.in);
        String a = s1.next();
        String b = s2.next();
        System.out.println((int)a.charAt(0)  + " " + (int)b.charAt(0));
        System.out.print(a.equals(b));
        System.out.println(a + " " + b);
    }
}