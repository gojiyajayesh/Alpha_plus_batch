import java.util.LinkedList;
import java.util.Queue;
public class BinaryQueue {
    public static void main(String[] args) {
        printBinary(5);
    }
    public static void printBinary(int n){
        Queue<String> q=new LinkedList<>();
        q.add("1");
        while(n-->0){
            String s=q.remove();
            System.out.print(s+" ");
            q.add(s+"0");
            q.add(s+"1");
        }
    }
}
