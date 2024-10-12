import java.util.*;
//a company decide to give bonus of 5 % to employe if his/her year of service is more than 5 years. ask user for their salary and year of service and print the net bonus amount

public class conditions6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the salary");
        int n = sc.nextInt();
        System.out.println("enter the year");
        int x = sc.nextInt();
        int z = n * x;
        if (x > 5) {
            System.out.println(z + (z * 5) / 100);
        } else {
            System.out.println(z);
        }
    }
}
