public class tiling {
    public static int TilingPromblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return (TilingPromblem(n - 1) + TilingPromblem(n - 2));
    }

    public static void main(String[] args) {
        System.out.println(TilingPromblem(3));
    }
}
