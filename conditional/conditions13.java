import java.util.*;

public class conditions13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int x = sc.nextInt();
        int y = (x % 10);
        int z = (x / 10) % 10;
        int v = (x / 100) % 10;
        int u = (x / 1000) % 10;
        int w = ((y * 1000) + (z * 100) + (v * 10) + (u * 1));
        System.out.println(w);
    }
}
