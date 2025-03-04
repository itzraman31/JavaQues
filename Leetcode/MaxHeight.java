import java.util.Arrays;
import java.util.Comparator;

class MaxHeight {
    public boolean check(int curr[], int prev[]) {
        if (curr[0] >= prev[0] && curr[1] >= prev[1] && curr[2] >= prev[2])
            return true;
        return false;
    }

    public int solve(int[][] cuboids) {
        int n = cuboids.length;
        int currRow[] = new int[n + 1];
        int nextRow[] = new int[n + 1];

        for (int curr = n - 1; curr >= 0; curr--) {
            for (int prev = curr - 1; prev >= -1; prev--) {
                int inc = 0;
                if (prev == -1 || check(cuboids[curr], cuboids[prev])) {
                    inc = cuboids[curr][2] + nextRow[curr + 1];
                }

                int exc = nextRow[prev + 1];

                currRow[prev + 1] = Math.max(inc, exc);
            }
            for (int k = 0; k < currRow.length; k++) {
                nextRow[k] = currRow[k];
            }
        }

        return nextRow[0];
    }

    public int maxHeight(int[][] cuboids) {
        for (int arr[] : cuboids) {
            Arrays.sort(arr);
        }

        Arrays.sort(cuboids, Comparator.comparingInt((int[] a) -> a[0])
                .thenComparingInt(a -> a[1])
                .thenComparingInt(a -> a[2]));

        return solve(cuboids);
    }

    public static void main(String[] args) {
        int[][] cuboids = {
            {3, 2, 5},
            {1, 7, 4},
            {3, 1, 8},
            {2, 6, 9}
        };

        MaxHeight obj = new MaxHeight();
        System.out.println(obj.maxHeight(cuboids));
    }
}
