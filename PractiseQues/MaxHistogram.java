
import java.util.Stack;

public class MaxHistogram {

    public static int[] rightsmall(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int res[] = new int[n];
        st.add(-1);

        for (int i = n - 1; i >= 0; i--) {
            while(st.peek()!=-1 && arr[st.peek()]>=arr[i])st.pop();
            if(st.peek()==-1 || arr[st.peek()]<arr[i]){
                res[i]=st.peek();
                st.add(i);
            }

        }
        return res;
    }

    public static int[] leftsmall(int arr[]){
        int n=arr.length;
        int res[]=new int[n];
        Stack<Integer> st=new Stack<>();
        st.add(-1);

        for(int i=0; i<n; i++){
            while(st.peek()!=-1 && arr[st.peek()]>=arr[i])st.pop();
            if(st.peek()==-1 || arr[i]>arr[st.peek()]){
                res[i]=st.peek();
                st.add(i);
            }
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        int n = arr.length;
        int rights[] = new int[n];
        int lefts[] = new int[n];

        rights = rightsmall(arr);

        for (int i : rights) {
            System.out.print(i + " ");
        }
        System.out.println();
        lefts=leftsmall(arr);

        for(int i:lefts){
            System.out.print(i+" ");
        }
    }
}
