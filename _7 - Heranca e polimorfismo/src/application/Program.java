package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.prefs.BackingStoreException;

public class Program {
  public static void main(String[] args) {
    /*
    Account acc1 = new Account(1001, "Alex", 1000.0);
    acc1.withdraw(200.0);
    System.out.println(acc1.getBalance());
    Account acc2 = new SavingsAccount(1002, "joao", 1000.0, 0.01);
    acc2.withdraw(200.0);
    System.out.println(acc2.getBalance());
    Account acc3 = new BusinessAccount(1003, "maria", 1000.0, 500.0);
    acc3.withdraw(200.0);
    System.out.println(acc3.getBalance());
    */

    // poliformismo
    Account x = new Account(1020, "joao", 1000.0);
    Account y = new SavingsAccount(1023, "jose", 1000.0, 0.01);

    x.withdraw(50.0);
    y.withdraw(50.0);

    System.out.println(x.getBalance());
    System.out.println(y.getBalance());
  }
}