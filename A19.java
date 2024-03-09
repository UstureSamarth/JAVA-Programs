public class A19 {
    public static void main(String[] args) {
        SavingAccount s=new SavingAccount();
        s.setCustomerName("Samarth");
        s.setAccountNo(1234);
        s.setBalance(5000.0f);
        SavingAccount.setRateOfInterest(6.5f);
        System.out.println(s.getCustomerName()+" "+s.getAccountNo()+" "+s.getBalance()+" "+s.calculateInterest(3));
    }
}
abstract class Account1{
    private float balance;
    private int accountNo;
    static float rateOfInterest;

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public float getBalance() {
        return balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public static float getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(float rateOfInterest) {
        Account1.rateOfInterest = rateOfInterest;
    }

    abstract float calculateInterest(int time);
}
class SavingAccount extends Account1{
    private String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    float calculateInterest(int time){
        return (getBalance()*time*getRateOfInterest())/100;
    }

}
