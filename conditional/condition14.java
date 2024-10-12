
//take three numbers from the user and print the greatest number
import java.util.*;

public class condition14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first no");
        int a = sc.nextInt();
        System.out.println("enter the second no");
        int b = sc.nextInt();
        System.out.println("enter the third no");
        int c = sc.nextInt();
        if ((a > b) && (a > c)) {
            System.out.println("a is greater than b, c");
        } else if ((b > a) && (b > c)) {
            System.out.println("b is greater than a,c");

        } else {
            System.out.println("c is greater than a, b");
        }
    }
}
