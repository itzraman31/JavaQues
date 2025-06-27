public class NumWaterBottles {
    public static int solve(int n, int m) {
        int count = n;
        while ((n / m) > 0) {
            int rem = n % m;
            count += n / m;
            n /= m;
            n += rem;
        }
        return count;
    }

    public static int numWaterBottles(int n, int m) {
        return solve(n, m);
    }

    public static void main(String[] args) {
        int n = 9;
        int m = 3;
        int result = numWaterBottles(n, m);
        System.out.println(result);
    }
}
