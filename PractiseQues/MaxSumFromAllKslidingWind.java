public class MaxSumFromAllKslidingWind {
    public static int solve(int nums[],int k){
        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<k; i++){
            sum+=nums[i];
        }

        int j=0;
        max=Math.max(max,sum);
        for(int i=k; i<nums.length; i++){
            sum=sum-nums[j++]+nums[i];
            max=Math.max(max,sum);
        }

        return max;
    }
    public static void main(String[] args) {
        int nums[]= {1, 9, 8, 2, 3, 5};
        int k = 2;
        System.out.println(solve(nums, k));
    }
}
