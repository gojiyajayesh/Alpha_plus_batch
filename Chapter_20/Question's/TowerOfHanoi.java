public class TowerOfHanoi {
    static int count=0;
    public static void main(String[] args) {
        int n=10;
        towerOfHanoi(n, "A","B","C");
        System.out.println(count);
    }
    public static void towerOfHanoi(int n,String source,String helper,String destination){
        count++;
        if(n==1){
            System.out.println("Transfer Disk-"+n+" From "+source+" To "+destination);
            return;
        }
        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("Transfer Disk-"+n+" From "+source+" To "+destination);
        towerOfHanoi(n-1, helper, source, destination);
    }
}
