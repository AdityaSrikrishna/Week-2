interface Loanable {
    void applyforloan(double amount);
    boolean calculateLoanEligibility();
}
abstract class BankAccount{
    private String accnum;
    private String holdername;
    private double balance;
    public BankAccount(String accnum, String holdername, double balance){
        this.accnum = accnum;
        this.holdername = holdername;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println(amount + " deposited." + "New Balance: " + balance);
        }
        else{
            System.out.println("Invalid Amount.");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance -= amount;
            System.out.println(amount + " withdrawn." + "New Balance: " + balance);
        }
        else{
            System.out.println("Invalid Amount.");
        }
    }
    public String getaccnum(){
        return accnum;
    }
    public double getbal(){
        return balance;
    }
    public String getholdername(){
        return holdername;
    }
    public abstract void calculateInterest();
}
class SavingsAccount extends BankAccount implements Loanable{
    private static final double rate = 0.04;
    public SavingsAccount(String accnum, String holdername, double balance){
        super(accnum, holdername, balance);
    }
    double b = getbal();
    public void calculateInterest(){
        double interest = getbal() * rate;
        System.out.println("Savings Interest: " + interest);
        b += interest;
        System.out.println(b);
    }
    public void applyforloan(double amount){
        if(calculateLoanEligibility()){
            System.out.println("Loan of " + amount + " approved for Savings Account.");
        }
        else{
            System.out.println("Loan not approved for savings account.");
        }
    }
    public boolean calculateLoanEligibility(){
        return getbal()>=1000;
    }
}
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    double b = getbal();
    @Override
    public void calculateInterest() {
        double interest = getbal() * INTEREST_RATE;
        System.out.println("Current Account Interest: " + interest);
        b += interest;
        System.out.println(b);
    }

    @Override
    public void applyforloan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan of " + amount + " approved for Current Account.");
        } else {
            System.out.println("Loan not approved for Current Account.");
        }
    }


    @Override
    public boolean calculateLoanEligibility() {
        return getbal() >= 5000;
    }
}
public class BankDetails{
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SA123", "Alice", 2000);
        BankAccount acc2 = new CurrentAccount("CA123", "Bob", 10000);
        acc1.deposit(500);
        acc1.calculateInterest();
        acc2.withdraw(2000);
        acc2.calculateInterest();
        if(acc1 instanceof Loanable l1){
            l1.applyforloan(1000);
        }
        if(acc2 instanceof Loanable l2){
            l2.applyforloan(5000);
        }
        System.out.println("Final Balance of Alice: " + acc1.getbal());
        System.out.println("Final Balance of Bob: " + acc2.getbal());
    }
}