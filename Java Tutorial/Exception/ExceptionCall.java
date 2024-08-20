public class ExceptionCall{
    public static void main(String[] args) throws Exception{
        f();
    }
    public static void f() throws Exception{
        s();
    }
    public static void s() throws Exception{
        throw t();
    }
    public static Exception t(){
        return new Exception();
    }
}