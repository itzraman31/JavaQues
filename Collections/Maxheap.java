import java.util.*;

public class Maxheap {

    public static void setval(int arr[], int ind) {

        while (ind > 1) {
            int parind = ind / 2;

            if (arr[parind] < arr[ind]) {
                int temp = arr[parind];
                arr[parind] = arr[ind];
                arr[ind] = temp;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Integer> max_heap=new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min_heap=new PriorityQueue<>();

        max_heap.add(2);
        max_heap.add(4);
        max_heap.add(1);
        max_heap.add(6);
        max_heap.add(3);

        min_heap.add(2);
        min_heap.add(4);
        min_heap.add(1);
        min_heap.add(6);
        min_heap.add(3);

        System.out.println(max_heap.peek());
        System.out.println(max_heap.size());
        System.out.println(min_heap.peek());

        // int arr[] = { -1, 4, 10, 3, 5, 1 };
        // int arr[] = { 10, 30, 50, 20, 35,5, 15 };

        // for (int i = 2; i < arr.length; i++) {
        // setval(arr, i);
        // }

        // for (int i = (arr.length / 2)-1; i >= 0; i--) {
        //     makeheap(arr, i);
        // }

        // System.out.print("Max Heap: ");
        // for (int i = 1; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
    }

    public static void makeheap(int arr[], int ind) {
        int a = ind;
        int c1 = 2 * ind + 1;
        int c2 = 2 * ind + 2;

        if (c1 < arr.length && arr[a] < arr[c1]) {
            a = c1;
        }

        if (c2 < arr.length && arr[a] < arr[c2]) {
            a = c2;
        }

        if (a != ind) {
            int temp = arr[a];
            arr[a] = arr[ind];
            arr[ind] = temp;
            makeheap(arr, a);
        }
    }
}
