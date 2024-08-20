public class Output {
    public static void main(String[] args) {
        Student s1 = new Student(12, "jayesh");
        System.out.println(s1.name + " " + s1.roll);
        Student s2 = new Student(s1);
        System.out.println(s2.name + " " + s2.roll);
        s1.name="mahesh";
        System.out.println(s1.name + " " + s1.roll);

        System.out.println(s2.name + " " + s2.roll);

    }
}

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    Student(Student s) {
        this.roll = s.roll;
        this.name = s.name;
    }
}