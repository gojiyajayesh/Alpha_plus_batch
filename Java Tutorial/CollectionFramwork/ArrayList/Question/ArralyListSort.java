import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArralyListSort {
    public static void main(String[] args) {
        // String Type ArrayList Sort Both Order
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("jayesh");
        stringList.add("gojiya");
        stringList.add("ahir");
        stringList.add("hello jayesh");

        // Sort In Ascending Order
        Collections.sort(stringList);
        System.out.println("Ascending Order " + stringList);
        // Sort In Descending Order
        Collections.sort(stringList, Collections.reverseOrder());
        System.out.println("Descending Order " + stringList);

        System.out.println("---------------------------------------------------------");
        // Integer Type ArrayList Sort Both Order
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(90);
        integerList.add(56);
        integerList.add(89);
        integerList.add(234);

        // Sort In Ascending Order
        Collections.sort(integerList);
        System.out.println("Ascending Order " + integerList);
        // Sort In Descending Order
        Collections.sort(integerList, Collections.reverseOrder());
        System.out.println("Descending Order " + integerList);

        System.out.println("---------------------------------------------------------");
        // Integer Type ArrayList Sort Both Order
        ArrayList<Student> studentList = new ArrayList<>();
        
        studentList.add(new Student(101,20,"jayesh"));
        studentList.add(new Student(102,29,"mayesh"));
        studentList.add(new Student(103,28,"rayesh"));
        studentList.add(new Student(104,22,"ahir"));
        studentList.add(new Student(105,23,"gojiya"));

        // Sort In Ascending Order Using Comparator Interface
        Collections.sort(studentList,new Comparator<Student>() {
            public int compare(Student f,Student s){
                return Integer.compare(f.age, s.age);
            }
        });
        System.out.println("Ascending Order " + studentList);
        // Sort In Descending Order
        Collections.sort(studentList, Collections.reverseOrder());
        System.out.println("Descending Order " + studentList);
    }
}

class Student implements Comparable<Student> {
    int roll;
    int age;
    String name;

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", age=" + age + ", name=" + name + "]\n";
    }

    public Student(int roll, int age, String name) {
        this.roll = roll;
        this.age = age;
        this.name = name;
    }

    public int compareTo(Student s) {
        return Integer.compare(this.age, s.age);
    }
}
