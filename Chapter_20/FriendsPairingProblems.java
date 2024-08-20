public class FriendsPairingProblems {
    public static void main(String[] args) {
        System.out.println(pairingProblrm(3));
    }
    public static int pairingProblrm(int n)
    {
        if(n==1||n==2)
        return n;
        // choice single
        int single=pairingProblrm(n-1);
        // choice pair
        int pair=(n-1)*pairingProblrm(n-2);
        return single+pair;
    }
}
