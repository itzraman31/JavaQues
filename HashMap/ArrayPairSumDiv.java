import java.util.*;

public class ArrayPairSumDiv {

    public static boolean solve(int[] arr, int k) {
        int[] remainderCount = new int[k];
        for (int num : arr) {
            int rem = ((num % k) + k) % k;
            remainderCount[rem]++;
        }

        if (remainderCount[0] % 2 != 0) return false;

        for (int i = 1; i < k; i++) {
            if (remainderCount[i] != remainderCount[k - i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = { -8,-9,-8,-2,-10,-3,7,3,9,4,0,5,-9,9,2,-9,-4,3,-5,5,-8,-9,1,2,10,-10,-3,9,5,-7,10,8,-6,6,8,-5,9,9,7,-8,8,7,4,2,-5,2,-5,8,3,-5,-6,-7,-3,8,6,-4,-5,-1,8,-9,2,2,-1,0,-2,7,0,-3,-7,3,-9,-7,-5,-9,-1,-10,-2,-8,-6,-9,-7,0,2,7,6,-8,-1,2,2,-7,-5,-3,10,5,8,-3,6,4,1,-7,0,-2,-6,-7,4,-8,-7,4,-8,7,0,5,7,-8,-2,-6,-1,7,8,-3,-1,-7,-2,9,7,-3,2,-4,-5,10,-3,5,9,7,2,1,-4,5,-6,8,4,2,-6,-10,-3,4,9,8,7,-1,4,1,-10,8,0,-4,-9,2,-9,-6,-2,-9,-6,0,4,2,-6,-3,2,-8,-10,-1,3,-7,-6,0,-9,0,-8,-4,-2,1,8,-8,1,-6,-5,-1,6,7,2,4,5,-3,-2,-4,-2,0,-7,-7,-3,4,3,-6,-9,-2,1,-4,5,-5,7,6,7,-10,0,-10,-2,9,8,6,-2,-3,1,0,-6,-3,-5,-2,5,1,10,-8,-4,0,8,4,-7,6,0,6,-7,3,-6,-4,7,-6,-9,-8,-10,-10,9,-8,0,-8,-7,2,-1,-7,-7,3,-4,-3 };
        int k = 4;

        System.out.println(solve(arr,k));

    }
}