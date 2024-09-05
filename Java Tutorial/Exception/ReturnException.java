public class ReturnException {
    public static void main(String[] args) {
        System.out.println(retu());
    }
    public static int retu(){
        try{
            return 1;
        }
        catch(Exception e){
            return -1;
        }
        finally{
            return 0;
        }
    }
}
