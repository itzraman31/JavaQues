import java.util.*;

public class NthFibbo {
    public static int solve(int x, int dp[]) {
        if (x == 1)
            return 0;
        if (x == 2)
            return 1;

        if (dp[x] != -1)
            return dp[x];
        dp[x] = solve(x - 1, dp) + solve(x - 2, dp);

        return dp[x];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = sc.nextInt();

        int dp[] = new int[x + 2];

        for (int i = 0; i <= x; i++) {
            dp[i] = -1;
        }

        System.out.println(x + "th fibbo number is: " + solve(x, dp));
    }
}
