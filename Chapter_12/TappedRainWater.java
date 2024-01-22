/**
 * TappedRainWater
 */
public class TappedRainWater {
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        tapping_rain_water(arr);
    }
    public static void tapping_rain_water(int arr[])
    {
        int area=0;
        for(int i=0;i<arr.length;i++)
        {
           int x= left(arr, i);
           int y= rigth(arr, i);
           int water_height=Math.min(x,y);
           area+=(water_height-arr[i]);
        }
        System.out.println(area);
    }
    public static int left(int arr[],int key)
    {
        int max=arr[key];
        for(int i=key-1;i>=0;i--)
        {
            if(max<arr[i])
            max=arr[i];
        }
        return max;
    }
    public static int rigth(int arr[],int key)
    {
        int max=arr[key];
        for(int i=key+1;i<arr.length;i++)
        {
            if(max<arr[i])
            max=arr[i];
        }
        return max;
    }
}