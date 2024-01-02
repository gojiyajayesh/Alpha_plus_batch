import java.util.*;
public class Gst_bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pen=sc.nextFloat();
        float pencil=sc.nextFloat();
        float eraser=sc.nextFloat();
        float bill=(pen+pencil+eraser)+((pen+pencil+eraser)*0.28f);
        System.out.println(bill);
        int $=24;
        System.out.println($);
        sc.close();
    }
}
