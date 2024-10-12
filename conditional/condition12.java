import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class condition12 {
    public static void main(String[] args) {
        int i = 3;
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FIZZBUZZ");
        } else if (i % 3 == 0) {
            System.out.println("fizz");

        } else {
            System.out.println("buzz");
        }

    }
}
