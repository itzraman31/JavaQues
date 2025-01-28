// package PractiseQues;
import java.util.*;

public class SumWithAlternateSignTillN {
    public static int solve(int n){
        if(n==0) return 0;

        if(n%2==0){
            return solve(n-1)-n;
        }
        else{
            return solve(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=sc.nextInt();

        System.out.println(solve(n));
    }
}
