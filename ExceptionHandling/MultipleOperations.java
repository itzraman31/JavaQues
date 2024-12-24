import java.util.Scanner;
class exceptionclass extends Exception {
    exceptionclass(String s){
        super(s);
    }
}
class exceptionexample{
    public int add(int a,int b)throws exceptionclass{
        if(a+b<0)
        {
            throw new exceptionclass("Both numbers should be positive");
        }
        return a+b;
    }
    public int sub(int a,int b)throws exceptionclass{
        if(a-b<0)
        {
            throw new exceptionclass("Subtraction result is negative");
        }
        return a-b;

    }
    public int div(int a,int b)throws exceptionclass{
        if(b==0)
        {
            throw new exceptionclass("b cannot be zero");
        }
        return a/b;

    }
    public int mul(int a,int b)throws exceptionclass{
        if(a*b>1000)
        {
            throw new exceptionclass("Multiplication cant exceed 10000");
        }
        return a*b;
    }
}

public class MultipleOperations {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a,b;
            System.out.print("Enter first number: ");
            a=sc.nextInt();
            System.out.print("Enter second number: ");
            b=sc.nextInt();

            exceptionexample ex=new exceptionexample();
                System.out.println(ex.add(a, b));

                System.out.printf("%.2f",234.948383);
       
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

        StringBuilder sb = new StringBuilder("Hello");
sb.delete(1, 3); // "Ho"
System.out.println(sb);


    }
}
