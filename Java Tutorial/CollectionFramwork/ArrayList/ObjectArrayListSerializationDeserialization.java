import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ObjectArrayListSerializationDeserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(101, "jayesh", 21)); // Anonumous Class Object create and store
        list.add(new Student(102, "Manju", 19));
        list.add(new Student(103, "Gojiya", 100));

        // Write Object data on disk Storage not in RAM

        FileOutputStream output = new FileOutputStream("objectDetail.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(output);
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
        output.close();

        // Read Object data store in disk

        FileInputStream input = new FileInputStream("objectDetail.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(input);
        @SuppressWarnings("unchecked")
        ArrayList<Student> list2 = (ArrayList<Student>) objectInputStream.readObject();
        System.out.println(list);
        System.out.println(list2);
        input.close();
        objectInputStream.close();

    }
}

class Student implements Serializable {
    int roll;
    String name;
    transient int age;

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
