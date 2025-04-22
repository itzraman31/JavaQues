import java.util.*;

public class CircularTour {
    public static int solve(int p[],int d[]){
        Queue<Integer> q=new LinkedList<>();

        for(int i=0; i<p.length; i++){
            int diff=p[i]-d[i];
            if(diff>0){
                q.add(i);
            }
        }
        int ind;
        while(!q.isEmpty()){
            ind=q.poll();
            int ind2=ind;
            int round=0;
            int diff=0;

            while (round!=2) {
                if(ind==ind2)round++;
                diff +=p[ind2]-d[ind2];
                if(diff<0)break;
                ind2=(ind2+1)%(p.length);
            }
            if(round==2)return ind;
        }
        return -1;
    }
    public static void main(String[] args) {
        int petrol[]={4,6,7,4};
        int dis[]={6,5,3,5};

        System.out.println(solve(petrol,dis));
    }
}
