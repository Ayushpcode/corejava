package Inheritance_2;

public class CurrentAccount extends BankAccount{
    private double overdraftLimit;

    public CurrentAccount(){}

    public CurrentAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overDraft) {
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount){
        if(amount <= balance + overdraftLimit){
            balance -= amount;

        }else{
            System.out.println("exceed overdraft limits");
        }
    }

    @Override
    public String toString() {
        return super.getAccountNumber()+"currentAccount{" +
                "overdraftLimit=" + overdraftLimit +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

}
