import java.util.Arrays;

public class MinSideJumps {
    
    public static int solve(int[] obstacles, int currlane, int currpos, int dp[][]) {
        if (currpos == obstacles.length - 1)
            return 0;

        if (dp[currlane][currpos] != -1)
            return dp[currlane][currpos];

        int min = Integer.MAX_VALUE;

        if (obstacles[currpos + 1] != currlane) {
            return solve(obstacles, currlane, currpos + 1, dp);
        } else {
            for (int i = 1; i <= 3; i++) {
                if (currlane != i && obstacles[currpos] != i) {
                    min = Math.min(min, 1 + solve(obstacles, i, currpos, dp));
                }
            }
        }

        dp[currlane][currpos] = min;
        return min;
    }

    public static int minSideJumps(int[] obstacles) {
        int dp[][] = new int[4][obstacles.length + 1];
        for (int i = 0; i < 4; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(obstacles, 2, 0, dp);
    }
    public static void main(String[] args) {
        int[] obstacles = {0, 1, 2, 3, 0};
        System.out.println("Minimum side jumps required: " + minSideJumps(obstacles));
    }
}
