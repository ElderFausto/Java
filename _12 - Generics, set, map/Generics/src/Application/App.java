package Application;

import entities.PrintService;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintService<Integer> printService = new PrintService<>();

    System.out.println("How many values? ");
    int number = sc.nextInt();

    for (int i = 0; i < number; i++) {
      Integer value = sc.nextInt();
      printService.addValue(value);
    }

    printService.print();
    Integer x = printService.first();
    System.out.println("First: " + x);

    sc.close();
  }
}
