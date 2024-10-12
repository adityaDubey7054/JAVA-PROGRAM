import java.util.*;

public class conditions12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the age");
        int x = sc.nextInt();
        System.out.println("enter sex");
        String y = sc.next();

        System.out.println("enter marital status");j
        String z = sc.next();
        if (y == "Female") {
            System.out.println("work in urban area");
        } else if (((y == "Male") && (x >= 40) && (x <= 60))) {
            System.out.println("work in urban area");
        } else if ((y == "Male") && ((x >= 20) && (x <= 40))) {
            System.out.println("work any where");

        } else {
            System.out.println("error");
        }

    }
}