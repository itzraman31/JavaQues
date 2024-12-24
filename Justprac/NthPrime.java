import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter Nth number: ");
        int n=sc.nextInt();

        int count=0;
        int f=2;
        int arr[]=new int[n];
        int c=0;
        int j=0;
        while (count<n) {
            c=0;
            for(int i=2; i<f; i++)
            {
                if(f%i==0)
                {
                    c++;
                    break;
                }
            }
            if(c==0)
            {
                arr[j++]=f;
                count++;
            }
            f++;
        }
        System.out.println("Nth Prime number is: "+arr[n-1]);
    }
    
}
