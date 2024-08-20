import java.util.Stack;

public class MaxAreaInHistogram {
    public static void main(String[] args) {
        int[] area={2,1,5,6,2,3};
        maxHistogram(area);
    }

    public static void maxHistogram(int[] histogram){
        int maxArea=0;
        int nsr[]=new int[histogram.length];
        int nsl[]=new int[histogram.length];
        Stack<Integer> st=new Stack<>();

        // Next Smaller Left
        for(int i=0;i<histogram.length;i++){
            while(!st.empty()&&histogram[st.peek()]>=histogram[i]){
                st.pop();                
            }
            if(st.empty())
            nsl[i]=-1;
            else
            nsl[i]=st.peek();
            st.push(i);
        }

        // Next Smaller Right
        st=new Stack<>();
        for(int i=histogram.length-1;i>=0;i--){
            while(!st.empty()&&histogram[st.peek()]>=histogram[i]){
                st.pop();                
            }
            if(st.empty())
            nsr[i]=histogram.length;
            else
            nsr[i]=st.peek();
            st.push(i);
        }

        // current Area

        for(int i=0;i<histogram.length;i++){
            int height=histogram[i];
            int width=nsr[i]-nsl[i]-1;
            int currArea=height*width;
            maxArea=Math.max(maxArea, currArea);
        }
        System.out.println("Max Area "+ maxArea);
    }

}
