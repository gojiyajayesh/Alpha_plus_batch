public class TestThrows {  
    //defining a method  
    public static int divideNum(int m, int n) throws ArithmeticException // write or not both same because unchecked exception Are Propogated without throws keyword 
     {  
        int div = m / n;  
        return div;  
    }  
    //main method  
    public static void main(String[] args) {  
        TestThrows obj = new TestThrows();  
        try {  
            System.out.println(TestThrows.divideNum(45, 0));  
            System.out.println(obj);
        }  
        catch (ArithmeticException e){  
            System.out.println("\nNumber cannot be divided by 0");  
        }  
          
        System.out.println("Rest of the code..");  
    }  
}