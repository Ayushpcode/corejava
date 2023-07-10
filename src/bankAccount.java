public class bankAccount {
   private int accountNumber;
   private double balance;
   public void bankAccount(){}

   public bankAccount(int accountNumber, int balance) {
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

   public void setBalance(int balance) {
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
