public class LongestLenSubseq {
    public static int solve(int arr[],int ind,int prev) {
        if(ind>=arr.length)return 0;

        int ans1=0,ans2=0;
        
        if(prev==-1 || prev<arr[ind]){
            ans1=solve(arr,ind+1,arr[ind])+1;
        }
        ans2=solve(arr,ind+1,prev);

        return Math.max(ans1,ans2);
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        int arr[]={5,8,3,7,9,1};

        System.out.println(solve(arr,0,-1));
    }
}
