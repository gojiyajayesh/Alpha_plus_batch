public class TryAndCatchBlock {
    public static void main(String[] args){
            try{
                    System.out.println(50/0);
                    System.out.println("Inside Try Block And After Exception Rest Of Code ...."); // This Is Not Execute so please only this code are write inside this may throw exception do not place whole code inside the try block
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            System.out.println("Rest Of Code Execute...");
    }
}