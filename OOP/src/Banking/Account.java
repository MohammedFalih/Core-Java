package Banking;

public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; };

    public String getAccountHolderName() { return accountHolderName; };

    public double getBalance() { return balance; };

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Amount Rs: " + amount + " has been deposited into your account." );
        } else {
            System.out.println("Failed to deposit amount. Check the amount.");
        }
    }

    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Amount Rs: " + amount + "has withdrawn from your account.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

}
