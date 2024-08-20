public class AllPermutationOfString {
    public static void main(String[] args) {
        permutation("jay", "");
    }

    public static void permutation(String str, String result) {
        if(str.length()==0)
        {
            System.out.println("Permutation :-"+result);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            permutation(str.substring(0, i)+str.substring(i+1), result+ch);
        }
    }
}