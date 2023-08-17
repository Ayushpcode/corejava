package abs_bank_account;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    void deposit(double amount) {
        balance += amount + (amount* interestRate);

    }

    @Override
    void withdraw(double amount) {
        if( amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Unsufficent funds");
        }

    }
}
