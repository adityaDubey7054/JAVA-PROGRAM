
// to check the maturity level of a men
import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("mature");
        } else {
            System.out.println("un mature");
        }
    }

}
