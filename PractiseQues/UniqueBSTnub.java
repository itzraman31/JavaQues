import java.util.Arrays;

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
    public static void main(String[] args) {
        int n=3;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(solve(n, dp));
    }    
}
