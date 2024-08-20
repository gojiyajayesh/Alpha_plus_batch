public class CustomExceptionClass {
    public static void main(String[] args) {
        try{
            sum();
        }
        catch(CustomException e){
            System.out.println(e);
        }
    }
    public static void sum() throws CustomException{
        throw new CustomException();
    }
}
class CustomException extends Exception{
    public CustomException(String s){
        super(s);
    }
    public CustomException(){
        super("CustomException");
    }
}
