import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorClass {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(101, "jayesh", 17));
        list.add(new Student(102, "ramesh", 14));
        list.add(new Student(103, "karan", 21));
        list.add(new Student(104, "suresh", 12));
        list.add(new Student(105, "mahek", 15));
        list.add(new Student(106, "nirbhay", 19));
        list.add(new Student(107, "pratik", 56));
        list.add(new Student(108, "gojiya", 78));
        list.add(new Student(109, "bhikhu", 7));

        // Sort the list by Age (using Comparable)
        Collections.sort(list); // Uses Student's natural ordering (by age)

        // Print the sorted list by age
        System.out.println("Sorted by age:");
        for (Student student : list) {
            System.out.println(student);
        }

        // Sort the list by Name (using Comparator)
        Collections.sort(list, new SortByName());

        // Print the sorted list by name
        System.out.println("\nSorted by name:");
        for (Student student : list) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {
    int roll;
    String name;
    int age;

    public Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.age);
    }
}

class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}
