public class Runtime3 {  
    public static void main(String args[]) throws Exception {  
        Runtime r = Runtime.getRuntime();  

        // Convert bytes to megabytes
        long totalMemory = r.totalMemory() / (1024 * 1024);
        long freeMemory = r.freeMemory() / (1024 * 1024);

        System.out.println("Total Memory: " + totalMemory + " MB");
        System.out.println("Free Memory: " + freeMemory + " MB");
        Runtime3 [] arr=new Runtime3[10000000];
        for (int i = 0; i < 10000000; i++) {  
            arr[i]=new Runtime3();  
        }  

        // Recalculate free memory after creating objects
        freeMemory = r.freeMemory() / (1024 * 1024);
        arr=null;
        System.out.println("After creating 10000 instances, Free Memory: " + freeMemory + " MB");  
        // Request garbage collection
        System.gc();  

        // Recalculate free memory after garbage collection
        freeMemory = r.freeMemory() / (1024 * 1024);
        System.out.println("After gc(), Free Memory: " + freeMemory + " MB");  
    }  
}  
