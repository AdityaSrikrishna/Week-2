class Bank{
    static String BankName = "Global Bank";
    private static int totalAccounts = 0;

    private String accountHolder;
    private final int accountNumber;
    private double balance;

    public Bank(String accountHolder, int accountNumber, double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }
    public static void total(){
        System.out.println("Total number of Accounts are: " + totalAccounts); 
    }
    public void displayDetails(){
        if(this instanceof Bank){
            System.out.println("Bank Name: " + BankName);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account balance: $" + balance);
            System.out.println("-----------------");
        }
    }
    public static void main(String[] args) {
        Bank bank1 = new Bank("Aditya", 1211, 5000);
        Bank bank2 = new Bank("Sri Krishna", 1212, 2000);
        bank1.displayDetails();
        bank2.displayDetails();
        Bank.total();
    }
}