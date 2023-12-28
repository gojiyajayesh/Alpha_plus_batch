import java.util.*;
public class Income_tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        float tax=0;
        if(income<500000)
        tax=0;
        else if(income<1000000)
        tax=income*0.2f;
        else
        tax=income*0.3f;
        System.out.println("Total MRP="+(income+tax));

    }
}
