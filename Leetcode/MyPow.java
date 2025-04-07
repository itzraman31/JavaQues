public class MyPow {

    public static double callme(double a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        if (b % 2 == 0) {
            return callme(a * a, b / 2);
        } else {
            return a * callme(a * a, b / 2);
        }
    }

    public static double negpow(double a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        if (b % 2 == 0) {
            return negpow(a * a, b / 2);
        } else {
            return a * negpow(a * a, b / 2);
        }
    }

    public static double myPow(double x, int n) {
        if (n >= 0) {
            return callme(x, n);
        }
        n = n * (-1);
        double ans = negpow(x, n);
        double res = 1 / ans;
        return res;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = -3;
        double result = myPow(x, n);
        System.out.println("Result: " + result);
    }
}
