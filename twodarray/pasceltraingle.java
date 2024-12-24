
import java.util.Scanner;

public class pasceltraingle {
    public static void printarray(int arr[][],int m){
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter number of rows: ");
            int m=sc.nextInt();

            System.out.println();

            int nums[][]=new int[m][m];

            for(int i=0; i<m; i++)
            {
                int c=i-1;
                int f=0;
                for(int j=0; j<=i; j++)
                {
                    if(i==0 || i==1)
                    { 
                        nums[i][j]=1;
                    }
                    else{
                        if(j==0 || j==i)
                        {
                            nums[i][j]=1;
                        }
                        else{
                            nums[i][j]=nums[c][f]+nums[c][f+1];
                            f++;
                        }
                    }
                }
            }
            printarray(nums, m);

        }
        
    }
}
