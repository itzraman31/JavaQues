import java.util.*;

public class Permutations {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void solve(int arr[],int ind,List<Integer> ans,List<List<Integer> > res){
        if(ind>=arr.length){
            res.add(new ArrayList(ans));
        }

        for(int i=ind; i<arr.length; i++){
            swap(arr,ind,i);
            ans.add(arr[ind]);
            solve(arr, ind+1, ans, res);
            ans.remove(ans.size()-1);
            swap(arr,ind,i);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<Integer> ans=new ArrayList<>();
        List<List<Integer> > res=new ArrayList<>();
    
        solve(arr,0,ans,res);

        for(List<Integer> i:res){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
