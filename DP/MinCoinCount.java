// package DP;
import java.util.*;

public class MinCoinCount {

    public static int solve(int[] coins,int amount){
        int[] dp=new int[amount+1];
        for(int i=0; i<=amount; i++)
        {
            dp[i]=Integer.MAX_VALUE;
        }
        dp[0]=0;

        for(int i=1; i<=amount; i++)
        {
            for(int j=0; j<coins.length; j++)
            {
                if(i-coins[j]>=0 && dp[i-coins[j]]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }

        if(dp[amount]==Integer.MAX_VALUE) return -1;
        return dp[amount];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int coins[]={1,2,5};
        
        System.out.print("Enter amount: ");
        int n=sc.nextInt();

        System.out.println("Minimum coins required are: "+solve(coins,n));
        
    }    
}
