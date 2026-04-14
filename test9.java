public class test9 {
    static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    public static void updateScore(Student s, int newScore) {
        s.score = newScore;
    }

    public static void main(String[] args) {
        Student tom = new Student("Tom", 85);
        int newScore = 95;

        System.out.println("Example input:");
        System.out.println("Tom: 85, newScore = 95");
        System.out.println();
        updateScore(tom, newScore);
        System.out.println("Expected output after update:");
        System.out.println(tom.name + ": " + tom.score);
    }
}
