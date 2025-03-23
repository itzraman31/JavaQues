public class ReducingDishes {
    public static int solve(int arr[],int ind,int time){
        if(ind>=arr.length)return 0;

        int inc=solve(arr,ind+1,time+1)+(time*arr[ind]);
        int exc=solve(arr,ind+1,time);

        return Math.max(inc, exc);
    }
    public static void main(String[] args) {
        int arr[]={-1,-8,0,5,-9};

        System.out.println("Max Satisfication like is: "+solve(arr,0,1));
    }
}