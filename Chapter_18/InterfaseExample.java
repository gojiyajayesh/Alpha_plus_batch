public class InterfaseExample {
    
    public static void main(String[] args) {
        Bear b=new Bear();
        b.eatgrass();
        b.eatmeet();
    }
}

interface Harbivore {
    void eatmeet();
}

interface Carnivore {
    void eatgrass();
}

class Bear implements Harbivore,Carnivore{
    public void eatgrass(){
        System.out.println("Eatgrass");
    }
    public void eatmeet(){
        System.out.println("Eat Meet");
    }
}