package application;

import entities.CLT;
import entities.PJ;
import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<TaxPayer> list = new ArrayList<>();

    System.out.println("Digite o numero de contribuintes");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.println("Contribuinte #" + i + " data:");
      System.out.println("CLT ou PJ (c/p)? ");
      char type = sc.next().charAt(0);
      System.out.println("Nome: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.println("Rendimento Anual: ");
      double income = sc.nextDouble();
      if (type == 'c') {
        System.out.println("Gastos com saude: ");
        double healthExpenditures = sc.nextDouble();
        list.add(new CLT(name, income, healthExpenditures));
      } else {
        System.out.println("Numero de empregados: ");
        int numberOfEmployess = sc.nextInt();
        list.add(new PJ(name, income, numberOfEmployess));
      }
    }
    double sum = 0.0;
    System.out.println();
    System.out.println("Impostos pagos: ");
    for (TaxPayer tp : list) {
      double tax = tp.tax();
      System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
      sum += tax;
    }
    System.out.println();
    System.out.println("Total de impostos pagos: $ " + String.format("%.2f", sum));

    sc.close();
  }
}
