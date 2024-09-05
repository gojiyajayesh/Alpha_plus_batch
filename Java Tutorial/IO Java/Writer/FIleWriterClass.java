import java.io.FileWriter;
import java.io.IOException;

public class FIleWriterClass {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter(
                "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\Writer_2.txt");

        String code = """
                import java.io.FileInputStream;
                import java.io.InputStreamReader;
                import java.io.Reader;
                import java.io.IOException;

                public class ReaderClass {
                    public static void main(String[] args) {
                        try (Reader reader = new InputStreamReader(
                                new FileInputStream("E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\Writer_1.txt"),
                                "UTF-8")) {
                            int i;
                            while ((i = reader.read()) != -1) {
                                System.out.print((char) i);
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
                """;

        writer.write(code);

        writer.close();
    }
}