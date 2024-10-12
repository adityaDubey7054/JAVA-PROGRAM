package recurnsion;

public class fibbonacci {
    public static int Fibb(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int f1 = Fibb(n - 1);
        int f2 = Fibb(n - 2);
        int nth = f1 + f2;
        return nth;
    }

    public static void main(String[] args) {
        System.out.println(Fibb(25));
    }
}
