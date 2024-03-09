import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int a=sc.nextInt();
        //int b=sc.nextInt();
        /*explicit throw implicit catch
        if(b==0)
            throw new ArithmeticException("Not possible to divide by zero");*/
        Account2 a=new Account2(1,5000);
        a.showBalance();
        System.out.print("Enter amount to withdraw:");
        try {
            a.withdraw(sc.nextInt());
            a.showBalance();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }
}
class Account2{
    private int accNO,balance;
    Account2(int an,int b) {
        this.accNO = an;
        this.balance = b;
    }
    void withdraw(int amt) throws InsufficientBalance {
            if(amt>balance)
                throw new InsufficientBalance("Insufficient Balance");
            balance-=amt;
    }
    void showBalance(){
            System.out.println("Balance "+balance);
    }
}
class InsufficientBalance extends Exception/*checked exception*/{
    InsufficientBalance(String s){
        super(s);
    }
}

