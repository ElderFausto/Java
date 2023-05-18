package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
  public static void main(String[] args) {
    Account acc = new Account(100, "elder", 1.2);
    BusinessAccount bacc = new BusinessAccount(200, "maria", 1.5, 500.0);

    // UPCASTING
    Account acc1 = bacc;
    Account acc2 = new BusinessAccount(1003, "bob", 0.0, 200.0);
    Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

    // DOWNCASTING
    BusinessAccount acc4 = (BusinessAccount) acc2;

    //BusinessAccount acc5 = (BusinessAccount)acc3;
    if (acc3 instanceof BusinessAccount) {
      BusinessAccount acc5 = (BusinessAccount) acc3;
      acc5.loan(200.0);
      System.out.println("Loan!");
    }

    if (acc3 instanceof SavingsAccount) {
      SavingsAccount acc5 = (SavingsAccount) acc3;
      acc5.updateBalance();
      System.out.println("Update!");
    }
  }
}
