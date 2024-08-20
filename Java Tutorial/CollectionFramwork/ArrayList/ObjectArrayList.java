import java.util.ArrayList;

public class ObjectArrayList {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101, "jayesh", 21)); // Anonumous Class Object create and store
        list.add(new Student(102, "Manju", 19));
        list.add(new Student(103, "Gojiya", 100));

        System.out.println(list);
    }
}

class Student {
    int roll;
    String name;
    int age;

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
    }

    public Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }
}
