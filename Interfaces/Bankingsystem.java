import java.util.Scanner;

interface Bank{
    void depoist(double amount);
    double withdraw(double amount);
    void interest(double amount);
    double viewbalance();
}

class Savingaccount implements Bank{

    private double balance;
    private double interest;

    Savingaccount(double bal,double interest){
        this.balance=bal;
        this.interest=interest;
    }

    public void depoist(double amount){
        balance=balance+amount;
    }
    public double withdraw(double amount){
        if(amount<balance)
        {
            balance=balance-amount;
            return balance;
        }
        else{
            // System.out.println("Insufficent amount");
            return -1.0;
        }
    }

    public void interest(double amount){
        balance=balance+balance*(this.interest/100);
    }

    public double viewbalance(){
        return balance;
    }
}

// class Currentaccount{

//     private double balance;
//     private double interest;
//     private double withdraw;

// }

public class Bankingsystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // System.out.print("Enter amount for initial balance: ");
        // double bal=sc.nextDouble();

        // System.out.print("Enter anually interest: ");
        // double interest=sc.nextDouble();

        // Savingaccount s1=new Savingaccount(bal, interest);

        Savingaccount s1=new Savingaccount(5000,2.5);

        s1.depoist(2000);
        
        double balance=s1.withdraw(150);

        System.out.println(s1.viewbalance());

        if(balance!=-1.0)
        {
            System.out.println("Withdrawl successfully");
        }
        else{
            System.out.println("Insufficent balance");
        }
    }
}