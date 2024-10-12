import java.util.*;

// to check the square or rectangle
public class conditions4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        int a = sc.nextInt();
        System.out.println("enter the breath ");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("square");

        } else {
            System.out.println("rectangle");
        }
    }
}