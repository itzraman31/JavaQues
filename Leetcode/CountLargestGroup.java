import java.util.*;

public class CountLargestGroup {

    static int sum(int n) {
        int res = 0;
        for (int i = n; i > 0; i = i / 10) {
            int c = i % 10;
            res = res + c;
        }
        return res;
    }

    public static int countLargestGroup(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int res = sum(i);
            ans[res] = ans[res] + 1;
        }

        int m = Arrays.stream(ans).max().getAsInt();
        int count = 0;
        for (int j = 0; j < ans.length; j++) {
            if (ans[j] == m) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 13;
        System.out.println(countLargestGroup(n));
    }
}
