public class BankAccounts{
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA123", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA456", 3000.0, 1000.0);
        FixedDepositAccount fixed = new FixedDepositAccount("FD789", 10000.0, 12);
        System.out.println("--------Savings Account--------");
        savings.AccountType();
        System.out.println();
        System.out.println("--------Checking Account--------");
        checking.AccountType();
        System.out.println();
        System.out.println("--------Fixed Deposit Account--------");
        fixed.AccountType();
        System.out.println();
    }
}
class BankAccount{
    protected String accnum;
    protected double balance;
    public BankAccount(String accnum, double balance){
        this.accnum = accnum;
        this.balance = balance;
    }
    public void showDetails(){
        System.out.println("Account Number: " + accnum);
        System.out.println("Balance: $" + balance);
    }
    public void AccountType(){
        System.out.println("Generic bank Account");
    }
}
class SavingsAccount extends BankAccount{
    protected double intrate;
    public SavingsAccount(String accnum, double balance, double intrate){
        super(accnum, balance);
        this.intrate = intrate;
    }
    @Override
    public void AccountType(){
        System.out.println("Savings Account");
        showDetails();
        System.out.println("Interest rate is: " + intrate + "%");
    }
}
class CheckingAccount extends BankAccount{
    protected double withamt;
    public CheckingAccount(String accnum, double balance, double withamt){
        super(accnum, balance);
        this.withamt = withamt;
    }
    @Override
    public void AccountType(){
        System.out.println("Checking Account");
        showDetails();
        System.out.println("Withdrawal Limit is: $" + withamt);
    }
}
class FixedDepositAccount extends BankAccount{
    protected int matper;
    public FixedDepositAccount(String accnum, double balance, int matper){
        super(accnum, balance);
        this.matper = matper;
    }
    @Override
    public void AccountType(){
        System.out.println("Fixed Deposit Account");
        showDetails();
        System.out.println("Maturity Period (in months): " + matper);
    }
}