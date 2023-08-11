package Inheritance_2;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }



    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
 public void applyInterest(){
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
 }

    @Override
    public String toString() {
        return "savingsAccount{" +
                "interestRate=" + interestRate +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}

