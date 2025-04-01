class Main1{
    public static void main(String[] args) {
        BankAccount cust1 = new BankAccount(12321, "Aditya", 12000);
        cust1.displaydetails();
        System.out.println("--------Savings Account--------");
        SavingsAccount cust2 = new SavingsAccount(12321, "Aditya", 12000);
        cust2.displaydetails();
    }
}
public class BankAccount{
    public int accountNumber;
    protected String accountHolder;
    private double balance;
    public BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber=accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void getbalance(){
        System.out.println("Balance is: " + balance);
    }
    public double  setbalance(double newBalance){
        balance = newBalance;
        return newBalance;
    }
    public void displaydetails(){
        System.out.println("Account Holder is: " + accountHolder);
        System.out.println("Account Number is: " + accountNumber);
        System.out.println("Account balance is: " + balance);
    }
}
class SavingsAccount extends BankAccount{
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }
    public void displayinfo(){
        System.out.println("Account Holder is: " + accountHolder);
        System.out.println("Account Number is: " + accountNumber);
    }
}