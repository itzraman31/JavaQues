public class ChalkReplacer {

    public static int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long sum1 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += chalk[i];
        }

        int f = (int)(k % sum1);
        long s = 0;

        for (int j = 0; j < n; j++) {
            s += chalk[j];
            if (s > f) {
                return j;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] chalk = {5, 1, 5};
        int k = 22;
        int result = chalkReplacer(chalk, k);
        System.out.println(result);
    }
}
