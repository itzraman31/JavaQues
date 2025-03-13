import java.util.*;

class EqualPartition {
    public static int solve(int nums[], int ind, int sum, int dp[][]) {
        if(sum==0)return 1;
        if(sum<0 || ind>=nums.length)return 0;
        if(dp[ind][sum]!=-1)return dp[ind][sum];
        int inc=solve(nums,ind+1,sum-nums[ind],dp);
        int exc=solve(nums,ind+1,sum,dp);
        return dp[ind][sum]=inc + exc;
    }
    public static int solve2(int nums[],int totsum) {
        int n=nums.length;
        int dp[][]=new int[n+1][totsum+1];
        for(int i=0; i<=n; i++){
            dp[i][0]=1;
        }
        for(int ind=n-1; ind>=0; ind--){
            for(int sum=0; sum<=totsum; sum++){
                int inc=0;
                if(sum-nums[ind]>=0){
                    inc=dp[ind+1][sum-nums[ind]];
                }
                int exc=dp[ind+1][sum];
                dp[ind][sum]=inc + exc;
            }
        }
        return dp[0][totsum];
    }
    public static int solve3(int nums[],int totsum) {
        int n=nums.length;
        int curr[]=new int[totsum+1];
        int next[]=new int[totsum+1];
        curr[0]=1;
        next[0]=1;
        for(int ind=n-1; ind>=0; ind--){
            for(int sum=0; sum<=totsum; sum++){
                int inc=0;
                if(sum-nums[ind]>=0){
                    inc=next[sum-nums[ind]];
                }
                int exc=next[sum];
                curr[sum]=inc + exc;
            }
            for(int k=0; k<=totsum; k++){
                next[k]=curr[k];
            }
        }
        return next[totsum];
    }
    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if(sum%2!=0)return false;
        int dp[][]=new int[nums.length+1][(sum/2)+1];
        for(int i=0; i<nums.length; i++){
            Arrays.fill(dp[i],-1);
        }
        int ans= solve3(nums,sum/2);
        if(ans==0)return false;
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        System.out.println(canPartition(nums));
    }
}
