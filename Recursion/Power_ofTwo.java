import java.util.*;

class Power_ofTwo {

    public static int power(int n, int c) {

        if (c == 0)
            return 1;

        if (c % 2 == 0) {
            return power(n, c / 2) * power(n, c / 2);
        } else {
            return n * power(n, (c - 1) / 2) * power(n, (c - 1) / 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int n = sc.nextInt();

        System.out.print("Enter power: ");
        int c = sc.nextInt();

        System.out.println("Ans is: " + power(n, c));
    }
}