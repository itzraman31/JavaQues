// package Justprac;

import java.util.Scanner;

public class primeton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int c;
        

        for (int i = 3; i <= n; i++) {
            c = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    c++;
                    break;
                }
            }
            if (c == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
