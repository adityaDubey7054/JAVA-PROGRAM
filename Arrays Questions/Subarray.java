public class Subarray {
    public static void SubArray(int number[]) {

        int max_sum = Integer.MIN_VALUE;
        int ts = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum = currentSum + number[k];
                    ts++;
                }
                System.out.println(currentSum);
                if (max_sum < currentSum) {
                    max_sum = currentSum;
                }

            }
            System.out.println();

        }
        System.out.println("total no of pair = " + ts);
        System.out.println("maximum sum is  = " + max_sum);

    }

    public static void main(String[] args) {
        int number[] = { 2, 3, 4, 5, 6, 7 };
        SubArray(number);
    }
}
