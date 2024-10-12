import java.util.*;

// a shop will give 10 % discount if the cost of purchased quantity is more than 1000.
//  ask user for quantity.suppose, one unit will cost 100.judge and print total cost for user
public class conditions5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the unit");
        int n = sc.nextInt();
        int x = n * 100;

        if (n > 10) {
            System.out.println(x + (x * 10) / 100);
        } else {
            System.out.println(x);
        }

    }
}
