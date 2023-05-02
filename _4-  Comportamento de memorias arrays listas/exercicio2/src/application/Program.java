package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a quantidade de itens");

    int n = sc.nextInt();
    Product[] vector = new Product[n];

    System.out.println("Digite os itens");

    for (int i = 0; i < vector.length ; i++) {
      sc.nextLine();
      System.out.println("Nome do item");
      String name = sc.nextLine();
      System.out.println("Preço do item");
      double price = sc.nextDouble();
      vector[i] = new Product(name, price);
    }

    double sum = 0.0;
    for (int i = 0; i < vector.length ; i++) {
      sum += vector[i].getPrice();
    }

    double avg = sum / vector.length;

    System.out.printf("Average price = %.2f%n", avg);

    sc.close();
  }
}
