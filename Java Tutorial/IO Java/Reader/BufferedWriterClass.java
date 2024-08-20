import java.io.*;

public class BufferedWriterClass {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader(
                "E:\\Alpha Plus Batch\\Java Topic And Important Code's\\IO Java\\AllFiles\\Writer_1.txt");
        BufferedReader br = new BufferedReader(fr);

        int i;
        while ((i = br.read()) != -1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
    }
}