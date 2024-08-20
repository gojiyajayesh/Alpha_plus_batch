public class MyThread3 {
    public static void main(String[] args) {
        Thread thread=new Thread(()->{
            System.out.println("This is a thread");
            while(true){
                System.out.println("Hello");
                try{
                    Thread.sleep(1000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        while(true){
            System.out.println("Hello2");
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
