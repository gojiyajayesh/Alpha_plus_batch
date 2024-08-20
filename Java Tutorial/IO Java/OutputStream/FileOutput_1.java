import java.io.FileOutputStream;

public class FileOutput_1 {
    public static void main(String[] args) {
        // Call the methods to write to the files
        writeByteArray();
        writeSingleChar();
    }

    public static void writeByteArray() {
        try {
            String s = "My name is Jayesh Ahir. I belong to Movan village in Dev Bhoomi Dwarka.\nCurrently, I am pursuing a B.Tech degree in Information Technology at LD College of Engineering.";

            FileOutputStream file = new FileOutputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_2.txt");

            byte[] data = s.getBytes();
            file.write(data);

            System.out.println("File created and written successfully.");
            file.close();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }

    public static void writeSingleChar() {
        try {
            FileOutputStream file = new FileOutputStream(
                    "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\FileOutput_1.txt");
            file.write(67); // Write single character according to ASCII value
            file.write(67);
            System.out.println("File created and written successfully.");
            file.close();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
