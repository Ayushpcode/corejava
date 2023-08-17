package abs_bank_account;

public class Executive {
    public static void main(String[] args) {
        SavingsAccount c1 = new SavingsAccount(5000.00 , 0);
        c1.deposit(500);
        c1.withdraw(600);
        System.out.println("Account detail of c1 "+ c1.toString());
        CheckAccount c2 = new CheckAccount(5000 , 1000);
        c2.deposit(100);
        c2.withdraw(6000);
        System.out.println("Account detail of c2 " + c2.toString());
    }
}

