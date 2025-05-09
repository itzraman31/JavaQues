public class CountPrimes {
    public static int countPrimes(int n) {
        int ans[] = new int[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (ans[i] == 0) {
                count++;
                for (int j = i * 2; j < n; j += i) {
                    ans[j] = 1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 20;
        int result = countPrimes(n);
        System.out.println(result);
    }
}
