import java.io.File;
import java.io.IOException;

public class FIleList {
    public static void main(String[] args) throws IOException{
        File file=new File("E:\\Alpha Plus Batch\\Chapter_23");
        String[] files=file.list();
        for(String s:files){
            System.out.println(s);
        }
    }
}
