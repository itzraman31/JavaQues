// package Array;
import java.util.*;

public class SortArrayByParity {
    
        public static int[] sortArrayByParity(int[] nums) {
            if(nums.length==1) return nums;
            int ans[]=new int[nums.length];
            int a=0;
            int b=nums.length-1;
    
            for(int i=0; i<nums.length; i++){
                int n=nums[i];
                if(n%2==0){
                    ans[a++]=n;
                }
                else{
                    ans[b--]=n;
                }
            }
            return ans;
        }
    public static void main(String[] args) {
        int nums[]={3,1,2,4};
       int ans[]= sortArrayByParity(nums);

       System.out.println();
       for(int i:ans){
        System.out.print(i+" ");
       }
    }

}
