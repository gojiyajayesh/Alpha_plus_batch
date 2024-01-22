public class While_loop {
    public static void main(String[] args) {
        int counter=0;
        while(counter<100)
        {
            System.out.println("Jayesh Ahir! "+counter);
            counter++;
        }
        while(true) // infinite loop
        {
            System.out.println(counter);
            counter++;
        }
    }
}