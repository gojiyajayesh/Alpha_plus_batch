import java.io.*;  
public class BufferedWriterClass {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("E:\\\\Alpha Plus Batch\\\\Java Topic And Important Code's\\\\IO Java\\\\AllFiles\\\\Writer_1.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome to Jayesh.");  
    buffer.close();  
    System.out.println("Success");  
    }  
}
