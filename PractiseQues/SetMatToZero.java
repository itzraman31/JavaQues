import java.util.*;

class Pair{
    int r;
    int c;

    void Pair(int r,int c){
        this.r=r;
        this.c=c;
    }
}
public int solve(int arr[][]){
    Set<Pair> st=new HashSet()<>(); 
    int r=arr.length;
    int c=arr[0].length;

    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            if(arr[i][j]==0){
                mp.add(new Pair(i,j));
            }
        }
    }

    for(Pair p:st){
        int r=p.r;
        int c=p.c;
    }
}