package Inheritance_2;

public class savingsAccount extends bankAccount{
    private double interestRate;

    public savingsAccount() {
        this.interestRate = interestRate;
    }

    public savingsAccount(int accountNumber, double balance, double interestRate) {
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

