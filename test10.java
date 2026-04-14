public class test10 {
    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] scores = {70, 85, 62, 90, 58};

        System.out.println("Example input: {70, 85, 62, 90, 58}");
        System.out.println("Expected output:");
        System.out.println(findMin(scores));
    }
}
