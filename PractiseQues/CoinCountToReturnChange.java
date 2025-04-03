public class CoinCountToReturnChange {
    public static void solve(int tot,double cost,double coins[],int ans[]){
        double changeAmount=tot-cost;
        System.out.println("Change amount is: "+changeAmount);
        for(int i=coins.length-1; i>=0; i--){
            if(changeAmount>=coins[i]){
                ans[i]=(int)(changeAmount/coins[i]);
                changeAmount=changeAmount%coins[i];
            }
        }
    }
    public static void main(String[] args) {
        double coins[] = { 0.25, 0.50, 1, 2, 5, 10 };
        int ans[]=new int[coins.length];

        solve(50,23.75,coins,ans);

        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
