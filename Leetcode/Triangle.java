import java.util.*;

class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if (n == 0) return 0; // Handle empty triangle case

        int[][] dp = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) { // Important: j <= i
                dp[i][j] = triangle.get(i).get(j);
                if (i < n - 1) { // Check if not last row
                    dp[i][j] += Math.min(dp[i + 1][j], dp[i + 1][j + 1]);
                }
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {

        // Example triangle 1
        List<List<Integer>> triangle1 = new ArrayList<>();
        triangle1.add(Arrays.asList(2));
        triangle1.add(Arrays.asList(3, 4));
        triangle1.add(Arrays.asList(6, 5, 7));
        triangle1.add(Arrays.asList(4, 1, 8, 3));
        int result1 = Triangle.minimumTotal(triangle1);
        System.out.println("Minimum total for triangle1: " + result1); // Output: 11

        // Example triangle 2 (single row)
        List<List<Integer>> triangle2 = new ArrayList<>();
        triangle2.add(Arrays.asList(-10));
        int result2 = Triangle.minimumTotal(triangle2);
        System.out.println("Minimum total for triangle2: " + result2); // Output: -10

        // Example triangle 3 (empty triangle)
        List<List<Integer>> triangle3 = new ArrayList<>();
        int result3 = Triangle.minimumTotal(triangle3);
        System.out.println("Minimum total for triangle3: " + result3); // Output: 0

        // Example triangle 4 (negative numbers)
        List<List<Integer>> triangle4 = new ArrayList<>();
        triangle4.add(Arrays.asList(-1));
        triangle4.add(Arrays.asList(-2, -3));
        int result4 = Triangle.minimumTotal(triangle4);
        System.out.println("Minimum total for triangle4: " + result4); // Output: -4

        // Example triangle 5 (uneven rows)
        List<List<Integer>> triangle5 = new ArrayList<>();
        triangle5.add(Arrays.asList(1));
        triangle5.add(Arrays.asList(2,3));
        triangle5.add(Arrays.asList(4,5,6));
        int result5 = Triangle.minimumTotal(triangle5);
        System.out.println("Minimum total for triangle5: " + result5); // Output: 7

        // Example triangle 6 (another uneven rows)
        List<List<Integer>> triangle6 = new ArrayList<>();
        triangle6.add(Arrays.asList(1));
        triangle6.add(Arrays.asList(2,3));
        triangle6.add(Arrays.asList(4,5,6,7));
        int result6 = Triangle.minimumTotal(triangle6);
        System.out.println("Minimum total for triangle6: " + result6); // Output: 8


    }
}