import java.util.*;

public class condition11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year");
        int x = sc.nextInt();
        if ((x % 4 == 0) && (x % 400 == 0)) {
            System.out.println("leap year");

        } else {
            System.out.println("not leap year");
        }

    }
}