import java.util.ArrayList;
import java.util.*;

public class SubArray {
    public static void solve(int nums[],int ind,ArrayList<Integer> ans){
        if(ind>=nums.length) {
            for(int i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
            // ans.clear();
            return;
        }

        solve(nums, ind+1,ans);

        for(int i=ind; i<nums.length; i++){
            ans.add(nums[i]);
            solve(nums, ind+1,ans);
            ans.remove(Integer.valueOf(nums[i]));
        }
    }
    public static void main(String[] args) {

        ArrayList<Integer> ans=new ArrayList<>();
        int nums[] = { 1,2,3 };

        solve(nums, 0,ans);
    }
}
