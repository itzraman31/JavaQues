
public class DiceRollMax {

    public static int solve(int n, int maxroll[], int count, int prev) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }

        int ans = 0;
        for (int i = 0; i < 6; i++) {
            if (prev == i) {
                if (count + 1 <= maxroll[i]) {
                    ans += solve(n - 1, maxroll, count + 1, prev);
                }
            } else {
                ans += solve(n - 1, maxroll, 1, i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        int maxroll[] = {1, 1, 1, 2, 2, 3};
        // int maxroll[]={1, 1, 1, 1, 1, 1};
        // int maxroll[]={1, 2, 1, 2, 1, 2};
        System.out.println(solve(n, maxroll, 0, -1));
    }
}
