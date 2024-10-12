import java.util.*;

public class conditions16 {
   public static void main(String[] args) {
      System.out.println("enter the year");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();

      if (a % 400 == 0) {
         if (a % 100 == 0) {
            System.out.println("leap year");
         }
      } else {
         System.out.println("not leap year");
      }
      if (a % 4 == 0) {
         System.out.println("leap year");
      } else {
         System.out.println("not leap year");

      }
   }
}
