import java.util.*;

public class MaxSizeSlices {
    public static int solve(int arr[], int ind, int s, int dp[][]) {
        if (s == 0 || ind >= arr.length) {
            return 0;
        }
        if (dp[ind][s] != -1) return dp[ind][s];
        int ans1 = arr[ind] + solve(arr, ind + 2, s - 1, dp);
        int ans2 = solve(arr, ind + 1, s, dp);
        return dp[ind][s] = Math.max(ans1, ans2);
    }

    public static int maxSizeSlices(int[] slices) {
        int s = slices.length;
        int dp[][] = new int[s + 1][(s / 3) + 1];
        for (int i = 0; i <= s; i++) {
            Arrays.fill(dp[i], -1);
        }
        int arr1[] = new int[s];
        int arr2[] = new int[s];
        int j = 0;
        for (int i = 0; i < s; i++) {
            if (i != (s - 1)) {
                arr1[i] = slices[i];
            }
            if (i != 0) {
                arr2[j++] = slices[i];
            }
        }
        int ans1 = solve(arr1, 0, s / 3, dp);
        for (int i = 0; i <= s; i++) {
            Arrays.fill(dp[i], -1);
        }
        int ans2 = solve(arr2, 0, s / 3, dp);
        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
        int[] slices = {1, 2, 3, 4, 5, 6};
        System.out.println(maxSizeSlices(slices));
    }
}
