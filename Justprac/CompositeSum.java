import java.util.*;
public class CompositeSum {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number:");
        int a=sc.nextInt();

        int arr[]=new int[a];

        if(a<=4) {
            System.out.println("-1");
            return;
        }

        int j=0;
        for(int i=2; i<=a && j<a; i=i+2)
        {

            if(i!=4){
                arr[j]=i;
                j++;
            }
        }

        arr[j]=4;
        j++;
        arr[j]=5;
        j++;

        for(int i=1; i<=a && j<a; i=i+2)
        {

            if(i!=5){
                arr[j]=i;
                j++;
            }
        }

        

        System.out.println();
        for(int i=0; i<a; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
