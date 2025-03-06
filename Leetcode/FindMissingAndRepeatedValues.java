import java.util.*;

class FindMissingAndRepeatedValues {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer, Integer> mp = new HashMap<>();
        int ans[] = new int[2];
        int rep = -1;
        int ele = 1;
        for (int arr[] : grid) {
            for (int i : arr) {
                mp.put(i, mp.getOrDefault(i, 0) + 1);
                if (mp.getOrDefault(i, 0) == 2) {
                    rep = i;
                }
            }
        }
        ans[0] = rep;
        for (int i : mp.keySet()) {
            if (!mp.containsKey(ele)) {
                ans[1] = ele;
                break;
            }
            ele++;
        }
        if (ans[1] == 0) {
            ans[1] = ele;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 2}, {2, 4}};
        int[] result = findMissingAndRepeatedValues(grid);
        System.out.println(Arrays.toString(result));
    }
}
