public class NthUglyNumber {
    public static int nthUglyNumber(int n) {
        int arr[] = new int[n + 1];
        int a = 1;
        int b = 1;
        int c = 1;

        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            int first = arr[a] * 2;
            int sec = arr[b] * 3;
            int third = arr[c] * 5;

            int min = Math.min(first, Math.min(sec, third));
            arr[i] = min;

            if (first == min)
                a++;
            if (sec == min)
                b++;
            if (third == min)
                c++;
        }
        return arr[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(nthUglyNumber(n));
    }
}
