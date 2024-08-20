import java.io.File;
import java.io.IOException;

public class FIleClass3 {
    public static void main(String[] args) throws IOException{
        File file_ =new File("E:\\Alpha Plus Batch\\Chapter_16");
        File[] files=file_.listFiles();
        for(File file:files){
            System.out.println(file.getName()+" Can Write: "+file.canWrite()+" IS Hidden: "+file.isHidden()+" Length: "+file.length()+" bytes"); 
        }
    }
}
