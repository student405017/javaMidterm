public class test8 {
    static class Student {
        String name;
        int score;

        Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
            new Student("Tom", 85),
            new Student("Mary", 90),
            new Student("John", 78)
        };

        System.out.println("Example students:");
        for (Student student : students) {
            System.out.println(student.name + ": " + student.score);
        }
    }
}
