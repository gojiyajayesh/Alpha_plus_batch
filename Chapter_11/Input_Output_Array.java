/**
 * Input_Output_Array
 */
import java.util.*;
public class Input_Output_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]=new String[10];
        for(int i=0;i<=9;i++)
        {
            System.out.print(str[i]);
            str[i]="jayesh";
            System.out.print(str[i]+" ");
        }
        sc.close();
    }
}