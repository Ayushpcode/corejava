package Inheritance_2;

import java.util.Scanner;

public class Executor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

                SavingsAccount customer = new SavingsAccount(900000101, 50000, 0.0);
                System.out.println("Enter deposit money !");
                double deposit = in.nextDouble();
                customer.deposit(deposit);
                System.out.println("Enter Interest value");
                double interest = in.nextDouble();
                customer.setInterestRate(interest);
                //optional ::
                System.out.println("Enter withdraw money !");
                double withdraw = in.nextDouble();
                customer.withdraw(withdraw);
                customer.applyInterest();
                System.out.println(customer.toString());

                CurrentAccount ca = new CurrentAccount(900000101, 50000, 0.0);
                System.out.println("Over draft limits !");
                double overDraft = in.nextDouble();
                ca.setOverdraftLimit(overDraft);
                ca.withdraw(500);
                System.out.println(ca.toString());



    }
}
