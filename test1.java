public class test1 {
    public static void main(String[] args) {
        int[] scores = {70, 80, 90};
        double sum = 0;

        for (int score : scores) {
            sum += score;
        }

        double average =  sum / scores.length;
        System.out.println("Average score: " + average);
    }
}
