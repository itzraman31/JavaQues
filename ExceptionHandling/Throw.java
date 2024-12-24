import java.util.Scanner;

class accessind{

    int ind(int arr[],int i){
        int size=arr.length;

        if(i>=size){
            throw new ArrayIndexOutOfBoundsException("Cannot access index sorrryyy!!!!");
        }else{
            return arr[i];
        }
    }
}

class oddexception{
    boolean tryit(int n){
        if(n!=2){
            throw new IllegalArgumentException("Number is ODD");
        }
        return true;
    }

    void checkeven(int n){
        try{
            tryit(n);
            System.out.println("Your entered number is Even Congrats!!");
        }
        catch(Exception e){
            System.out.println(e+e.getMessage());
            throw new IllegalArgumentException("Alerting to main function");
        }
    }
}

public class Throw {
    public static int div(int a){
        if(a>0)
        {
            return a/1;
        }
        else{
            throw new ArithmeticException("Cannot divide with zero");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // System.out.print("Enter the number to divide: ");
        // int d=sc.nextInt();

        // System.out.print("Enter index to access: ");
        // int i=sc.nextInt();
        // int arr[]={3,4,2,4,5};

        // accessind ac=new accessind();

        // try{
        //     System.out.println("Elements at given ind is: "+ac.ind(arr, i));
        // }
        // catch(Exception e){
        //     // e.printStackTrace();
        //     System.out.println("A Exception has occured have a look --> "+e.getMessage());
        // }

        // try{
        //     System.out.println(div(d));
        // }
        // catch(Exception e){
        //     System.out.println(e.getMessage());
        // }

        System.out.print("Enter number to check: ");
        int n=sc.nextInt();

        oddexception odd=new oddexception();

        try{
            odd.checkeven(n);
        }
        catch(Exception e)
        {
            // System.out.println(e.getMessage());
            // e.printStackTrace();
        }
        
    }
}
