/**
 * ConstructorCopy
 */
public class ConstructorCopy {
    public static void main(String[] args) {
        Student s1 = new Student("jayesh", 101, "J12345@g");
        s1.marks[0] = 120;
        s1.marks[1] = 110;
        s1.marks[2] = 100;
        Student s2 = new Student(s1);
        System.out.println(s2.marks[0]);
        s1.marks[0] = 10;
        s1.name = "nirbhay";
        System.out.println(s2.marks[0]);
        System.out.println(s2.name);
        System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    Student(Student s) {
        this.name = s.name;
        this.roll = s.roll;
        this.password = s.password;
        this.marks = s.marks;
        // marks = new int[3];
        // for (int i = 0; i < 3; i++) {
        // this.marks[i] = s.marks[i];
        // }
        System.out.println("s.marks=" + s.marks);
        int hashCode = System.identityHashCode(s.marks);
        System.out.println("Hash code of the array: " + hashCode);
        String address = Integer.toHexString(hashCode);
        System.out.println("Address of the array: " + address);
        System.out.println("----------------------------------------------------------------");
        System.out.println("this.marks=" + this.marks);
        int hashCode2 = System.identityHashCode(this.marks);
        System.out.println("Hash code of the array: " + hashCode2);
        String address2 = Integer.toHexString(hashCode2);
        System.out.println("Address of the array: " + address2);
        System.out.println("-----------------------------------------------------------------\nDone...");
    }

    Student(String name, int roll, String password) {
        System.out.println("Parameterized Constructor is called...");
        this.name = name;
        this.password = password;
        this.roll = roll;
        marks = new int[3];
    }
}