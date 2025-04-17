
public class UniqueBSTnub {
    public static int solve(int n,int dp[]){
        if(n<=1)return 1;
        if(dp[n]!=-1)return dp[n];

        int ans=0;
        for(int i=1; i<=n; i++){
            ans+=solve(i-1,dp)*solve(n-i,dp);
        }
        return dp[n]=ans;
    }
    
    public static int solve2(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2; i<=n; i++){
            int ans=0;
            for(int j=1; j<=i; j++){
                ans+=dp[j-1]*dp[i-j]; 
            }
            dp[i]=ans;
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=13;
        // int dp[]=new int[n+1];
        // Arrays.fill(dp,-1);
        // System.out.println(solve(n, dp));

        System.out.println(solve2(n));
    }    
}
