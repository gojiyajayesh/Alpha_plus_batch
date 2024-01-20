public class Question_1 {
    public static void main(String[] args) {
        System.out.println(vowel("hello jayesh"));
    }
    public static boolean isVowel(char ch)
    {
        if(ch=='i'||ch=='a'||ch=='e'||ch=='o'||ch=='u')
        return true;
        return false;
    }
    public static int  vowel(String str)
    {
        int cnt=0;
        for(int i=0;i<str.length();i++)
        {
            if(isVowel(str.charAt(i)))
            cnt++;
        }
        return cnt;
    }
}
