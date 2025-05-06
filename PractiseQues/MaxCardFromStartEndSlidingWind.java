public class MaxCardFromStartEndSlidingWind {
    public static int solve(int arr[],int k){
        int sum=0;
        int maxSum=0;

        for(int i=0; i<k; i++){
            sum+= arr[i];
        }
        maxSum=Math.max(maxSum,sum);
        int j=k-1;
        for(int i=arr.length-1; i>=arr.length-k; i--){
            sum+=arr[i]-arr[j--];
            maxSum=Math.max(maxSum,sum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={6,2,3,4,7,2,1,7,1};
        int k=4;

        System.out.println(solve(arr,k));
    }
}