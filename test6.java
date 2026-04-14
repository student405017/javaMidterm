public class test6 {
    public static int countPassing(int[] scores) {
        int count = 0;

        for (int score : scores) {
            if (score >= 60) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] scores = {45, 60, 80, 59, 100};

        System.out.println("Example input: {45, 60, 80, 59, 100}");
        System.out.println("Expected output:");
        System.out.println("Number of passing students: " + countPassing(scores));
    }
}
