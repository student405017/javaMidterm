public class test3 {
    public static void addBonus(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            scores[i] += 5;
        }
    }

    public static void main(String[] args) {
        int[] scores = {60, 70};

        System.out.println("Before bonus: {" + scores[0] + ", " + scores[1] + "}");

        addBonus(scores);

        System.out.println("After bonus: {" + scores[0] + ", " + scores[1] + "}");
    }
}
