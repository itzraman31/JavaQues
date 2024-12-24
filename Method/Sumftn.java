package Method;
import java.util.*;

class SUM{
    int sum1(int a,int b){
        return a+b;
    }
}

class Sumftn{

    int sum(int a,int b){
        return a+b;
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a;
            int b;
            a=sc.nextInt();
            b=sc.nextInt();

            // SUM s=new SUM();
            // int result=s.sum1(a, b);

            // System.out.println(result);


            Sumftn s1=new Sumftn();

            int r=s1.sum(a,b);

            System.out.println(r);
        }

    }
}