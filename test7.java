public class test7 {
    public static int sum(int[] arr) {
        int total = 0;

        for (int num : arr) {
            total += num;
        }

        return total;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.println("Example input: {1, 2, 3, 4}");
        System.out.println("Expected output:");
        System.out.println(sum(arr));
    }
}
