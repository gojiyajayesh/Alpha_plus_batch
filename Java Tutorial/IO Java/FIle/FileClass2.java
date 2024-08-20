import java.io.File;

public class FileClass2 {
    public static void main(String[] args) {
        String path="";
        try {
            File file=new File("gojiya.txt");
            file.createNewFile();
            System.out.println(file);

            File file2=file.getCanonicalFile();

            System.out.println(file2);

            boolean exists=file2.exists();
            path=file2.getAbsolutePath();
            if(exists){
                System.out.println(path);
            }
            else
            {
                System.out.println("Errorororororororororororororor");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
