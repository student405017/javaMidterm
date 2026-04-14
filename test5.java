public class test5 {
    static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    public static void curve(Student s) {
        if (s.score < 60) {
            s.score += 10;
        }
    }

    public static void main(String[] args) {
        Student tom = new Student("Tom", 55);
        curve(tom);
        System.out.println("Expected result for Tom with score 55 after calling curve:");
        System.out.println(tom.name + ": " + tom.score);
    }
}
