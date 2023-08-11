package Inheritance_2;

public class BankAccount {
    int accountNumber;
    double balance;

    public BankAccount(){}

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;

    }
    public void withdraw(double amount){
        if( amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Unsufficent funds");
        }

    }
    public double getbalance(){
        return balance;
    }
    @Override
    public String toString() {
        return "bankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}

