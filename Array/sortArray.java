package Array;
// import java.lang.reflect.Array;
import java.util.*;

public class sortArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter size of array: ");
            int a = sc.nextInt();
            int arr[] = new int[a];

            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int arr2[]=Arrays.copyOf(arr, 6);
            
            System.out.println();
            System.out.println();
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i]+" ");
            }
        }
    }
}
