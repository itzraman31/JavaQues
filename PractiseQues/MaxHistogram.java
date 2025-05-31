

public class MaxHistogram {
    public static int[] solve(int arr[]){
        int n=arr.length;
        int currind=n;
        int newarr[]=new int[n];

        for(int i=n-1; i>=0; i--){
            if(arr[i]==1){
                newarr[i]=currind;
            }
            else{
                newarr[i]=i;
                currind=i;
            }
        }
        return newarr;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int arr[]={1,0,1,1,1};
        int n=arr.length;
        int newarr[]=new int[n];
        
        newarr=solve(arr);

        for(int i:newarr){
            System.out.print(i+" ");
        }
    }
}
