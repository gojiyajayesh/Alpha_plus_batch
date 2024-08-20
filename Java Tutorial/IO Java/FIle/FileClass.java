import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) throws IOException {
        File file = null;
        try {
            file = new File("Jayesh.txt");
        } catch (Exception e) {
            System.out.println(e);
        }
        if (file.createNewFile()) {
            System.out.println("File is Created Successfully...");
        } else {
            System.out.println("Some Error Occur");
        }
    }
}
