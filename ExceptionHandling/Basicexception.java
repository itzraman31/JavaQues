// package ExceptionHandling;

import java.util.*;

public class Basicexception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter to get index: ");
        int i=sc.nextInt();

        System.out.print("Enter number to divide with: ");
        int d=sc.nextInt();

        int arr[]=new int[4];

        arr[0]=12;
        arr[1]=54;
        arr[2]=9;
        arr[3]=7;

        System.out.println();
        try{
            // System.out.println("First TRY");
            System.out.println("Value at your entered index: "+ arr[i]);
            
            try{
                // System.out.println("Second TRY");
                System.out.println("Answer after dividing with your number: "+arr[i]/d);
            }
            catch(Exception e){
                System.out.println("Second CATCH");
                System.out.println(e);
            }
            
        }
        catch(Exception e){
            System.out.println("FIRST CATCH");
            System.out.println(e);
        }
    }
}
