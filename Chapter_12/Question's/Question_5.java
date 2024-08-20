public class Question_5 {
    public static void main(String[] args) {
            int arr[]={-1, 0,  1, 2, -1, -4};
            triplets(arr);
    }
   // This solution is not complate becase HashSet Chapter is Not Learn   after this chapter Solve complate this solution
    public static void triplets(int arr[]) {
        int n=arr.length;
        if(n<3)
        return;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==0)
                    {
                        System.out.println("["+arr[i]+" "+arr[j]+" "+arr[k]+"]");
                    }
                }
            }
        }
    }
}
