import java.util.Arrays;

public class GuessLowHighNum {
    public static int solve(int s,int e,int dp[][]){
        if(s>=e)return 0;
        if(dp[s][e]!=-1)return dp[s][e];

        int ans=Integer.MAX_VALUE;
        for(int i=s; i<=e; i++){
            ans=Math.min(ans,i+Math.max(solve(s,i-1,dp),solve(i+1,e,dp)));
        }
        return dp[s][e]=ans;
    }
    public static void main(String[] args) {
        int n=5;
        int dp[][]=new int[n+1][n+1];

        for(int i=0; i<=n; i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(solve(1,n,dp));
    }
}
