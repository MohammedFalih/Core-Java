package Banking;

public class Main {
    public static void main(String[] args) {
       Bank bank = new Bank(10);

       Account account1 = new Account("23423562", "Mohammed Falih", 79000.00 );
       Account account2 = new Account("54686543", "Mohammed Azmin", 7900.00 );

       bank.addAccount(account1);
       bank.addAccount(account2);

       bank.depositMoney("23423562", 10000.00);
       bank.withdrawMoney("54686543", 2000);

       bank.printAccountDetails("54686543");
       bank.printAccountDetails("23423562");

    }
}
