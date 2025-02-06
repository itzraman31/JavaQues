
public class PrefixSum {
    public static int solve(int arr[],int ind){
        if(ind>=arr.length || arr.length==0){
            return 0;
        }
        return arr[ind]+solve(arr,ind+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.print("Sum is: "+solve(arr,0));
    }    
}
