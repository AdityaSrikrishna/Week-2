import java.util.ArrayList;
import java.util.List;
public class BankAccount{
    public static void main(String[] args) {
        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Custom cust1 = new Custom("Aditya");
        Custom cust2 = new Custom("Alice");

        sbi.openAccount(cust1, "SBI001", 10000);
        sbi.openAccount(cust2, "SBI002", 5000);

        hdfc.openAccount(cust1, "HDFC001", 15000);
        
        sbi.listCustomers();
        hdfc.listCustomers();

        cust1.showdetails();
        cust2.showdetails();
    }
}
class Account{
    private final String AccountNum;
    private double balance;
    public Account(String AccountNum, double balance){
        this.AccountNum = AccountNum;
        this.balance = balance;
    }
    public String getAccnum(){
        return AccountNum;
    }
    public double getbal(){
        return balance;
    }
}
class Custom{
    private String custname;
    private List<Account> accounts;
    public Custom(String custname){
        this.custname = custname;
        this.accounts = new ArrayList<>();
    }
    public void addacc(Account account){
        accounts.add(account);
    }
    public void showdetails(){
        System.out.println("Customer Name: " + custname);
        System.out.println("---------------------");
        if(accounts.isEmpty()){
            System.out.println("Customer does not have any accounts.");
        }
        else{
            for(Account a : accounts){
                System.out.println("Account Number: " + a.getAccnum() + " Balance: " + a.getbal());
            }
        }
    }
    public String getName(){
        return custname;
    }
}
class Bank{
    private String name;
    private List<Custom> customers;
    public Bank(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }
    public void openAccount(Custom customer, String AccountNum, double initialdeposit){
        if(!customers.contains(customer)){
            customers.add(customer);
        }
        Account newAccount = new Account(AccountNum, initialdeposit);
        customer.addacc(newAccount);
        System.out.println("Account " + AccountNum + " opened for " + customer.getName() + " at " + name);    
    }
    public void listCustomers(){
        System.out.println("Customers of " + name + ":");
        for(Custom c : customers){
            System.out.println("-" + c.getName());
        }
        System.out.println();
    }
}