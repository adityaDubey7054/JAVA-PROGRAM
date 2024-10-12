import java.util.*;

// a student will not be allowed to sit in exam if his/her attendence is less than 75% take following input from user, number of classes held, number of  
// classes attended and print . percentage of class attend ,Is student is allowed to sit in exam or not
public class conditions9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("total no of classes organised");
        float x = sc.nextFloat();
        System.out.println(" no of classes attend");
        float y = sc.nextFloat();
        float v = (y * 100) / x;
        float z = (75 * x) / 100;
        System.out.println("medical certificate");
        String a = sc.next();
        if (y >= z) {
            System.out.println(" eligible for exam");

        } else if ((y <= z) && (a == "Yes")) {
            System.out.println("elligible for exam");
        }

        else {
            System.out.println("not elligible");

        }
        System.out.println("percentage obtain ");
        System.out.println(v);
    }
}
