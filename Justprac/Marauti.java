import java.util.*;

public class Marauti{
    public static void solve(String s,int arr[]){
        arr[1]=1;
        arr[2]=1;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter your string: ");
    String s=sc.nextLine();

    int arr[]={1,2,3};

    solve(s,arr);
    // System.out.println(s);
    for(int i:arr){
        System.out.print(i+" ");
    }
   }
}