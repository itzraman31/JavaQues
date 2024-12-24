import java.util.Scanner;

class invalidnumber extends Exception {
    invalidnumber(String s) {
        super(s);
    }
}

class exceptionclass {
    public int pell(int n) throws invalidnumber {

        if (n > 20) {
            throw new invalidnumber("number cannot be greater than 20!!!");
        } else if (n < 0) {
            throw new invalidnumber("numbr cant be negative!!!");
        } else if (n == 0) {
            throw new invalidnumber("number cant be 0 !!");
        } else if (n >= 10 && n <= 20) {
            int ans = 1;
            for (int i = 1; i <= n; i++) {
                ans = ans * i;
            }
            return ans;
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }
}

public class Ncustomnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int n = sc.nextInt();

        exceptionclass ex = new exceptionclass();

        try {
            System.out.println(ex.pell(n));
        } catch (invalidnumber e) {
            // System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}