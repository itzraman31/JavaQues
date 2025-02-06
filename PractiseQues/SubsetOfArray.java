import java.util.*;

public class SubsetOfArray {
    public static void solve(int[] arr, int ind, ArrayList<Integer> res, ArrayList<ArrayList<Integer>> ans) {
        if (ind >= arr.length) {
            ans.add(new ArrayList(res));
            return;
        }
        int ele = arr[ind];
        res.add(ele);
        solve(arr, ind + 1, res, ans);

        res.remove(Integer.valueOf(ele));

        solve(arr, ind + 1, res, ans);

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4 };

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        solve(arr, 0, res, ans);

        for (ArrayList<Integer> i : ans) {
            for (int j = 0; j < i.size(); j++) {
                System.out.print(i.get(j) + " ");
            }
            System.out.println();
        }
    }

}