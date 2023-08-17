package abs_bank_account;

 class CheckAccount extends BankAccount {
     private double overdraftLimit;


     public CheckAccount(double balance, double overdraftLimit) {
         super(balance);
         this.overdraftLimit = overdraftLimit;
     }

     @Override
     public void deposit(double amount) {
         balance += amount;
     }

     @Override
     public void withdraw(double amount) {
         if(amount <= balance + overdraftLimit){
             balance -= amount;

         }else{
             System.out.println("exceed overdraft limits");
         }
     }
 }
