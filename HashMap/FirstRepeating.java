import java.util.*;

public class FirstRepeating {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Map<Integer,Integer> mp=new HashMap<>();

        System.out.print("Enter size of array: ");
        int a=sc.nextInt();

        int arr[]=new int[a];

        System.out.println("Enter ele in array: ");
        for(int i=0; i<a; i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<a; i++)
        {
            if(mp.containsKey(arr[i])){
                System.out.println("First Repeating ele is: "+arr[i]+" at: "+i);
                break;
            }
            else{
                mp.put(arr[i], 0);
            }
        }
    }
}
