import java.util.*;

public class Prac {
    public static void main(String[] args) {
        int arr[] = { 11, 2, 3 ,14,5,6};

        boolean istrue = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                istrue = false;
                break;
            }
        }
        if (istrue)
        {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
