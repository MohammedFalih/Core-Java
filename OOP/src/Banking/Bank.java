package Banking;

public class Bank {
    private Account[] accounts;
    private int accountCount;

    public Bank(int size){
        accounts = new Account[size];
        accountCount = 0;
    }

    public void addAccount(Account account){
        if(accountCount < accounts.length){
            accounts[accountCount] = account;
            accountCount++;
            System.out.println("Hello "+ account.getAccountHolderName() + ", Accout added successfully");
        } else {
            System.out.println("Sorry for inconvenience");
        }
    }

    public void removeAccount(String accountNumber){
        for(int i = 0; i < accountCount; i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                accounts[i] = accounts[accountCount - 1];
                accounts[accountCount - 1] = null;
                accountCount--;
                System.out.println("Account with acc.no: " + accountNumber + " has been removed.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void depositMoney(String accountNumber, double amount){
        Account account = findAccount(accountNumber);
        if(account != null){
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdrawMoney(String accountNumber, double amount){
        Account account = findAccount(accountNumber);
        if(account != null){
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void printAccountDetails(String accountNumber){
        Account account = findAccount(accountNumber);
        if(account != null){
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Account Holder: " + account.getAccountHolderName());
            System.out.println("Balance: $" + account.getBalance());
        }
    }

    private Account findAccount(String accountNumber) {
        for(int i = 0; i < accountCount; i++){
            if(accounts[i].getAccountNumber().equals(accountNumber)){
               return accounts[i];
            }
        }
        return null;
    }
}
