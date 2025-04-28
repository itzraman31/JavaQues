public class LongestSubArrSumLessThanK {
    public static int solve(int arr[],int sum){
        int maxlen=0;
        int currsum=0;
        int p1=0;
        int p2=0;

        while(p2<arr.length){
            currsum+=arr[p2++];
            if(currsum>sum){
                currsum-=arr[p1++];
            }
            maxlen=Math.max(maxlen, p2-p1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,7,10};
        int sum=14;
        System.out.println(solve(arr,sum));        
    }    
}

// public class LongestSubArrSumLessThanK {
//     public static int solve(int arr[],int sum){
//         int maxlen=0;
//         int currsum=0;
//         int p1=0;
//         int p2=0;

//         while(p2<arr.length){
//             currsum+=arr[p2++];
//             while(currsum>sum){
//                 currsum-=arr[p1++];
//             }
//             maxlen=Math.max(maxlen, p2-p1);
//         }
//         return maxlen;
//     }
//     public static void main(String[] args) {
//         int arr[]={2,5,1,7,10};
//         int sum=14;
//         System.out.println(solve(arr,sum));        
//     }    
// }
