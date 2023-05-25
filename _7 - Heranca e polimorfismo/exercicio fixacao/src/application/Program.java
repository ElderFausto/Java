package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UserProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Product> list = new ArrayList<>();

    System.out.println("Digite o numero de produtos: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.println("Dados do produto" + i + ":");
      System.out.println("Comum, usado, importado (c/u/i)? ");
      char type = sc.next().charAt(0);
      System.out.println("Nome: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.println("Preço: ");
      double price = sc.nextDouble();
      if (type == 'c') {
        list.add(new Product(name, price));
      } else if (type == 'u') {
        System.out.println("Data de fabricação (DD/MM/YYYY");
        LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        list.add(new UserProduct(name, price, date));
      } else {
        System.out.println("Taxa de importação: ");
        double customFee = sc.nextDouble();
        list.add(new ImportedProduct(name, price, customFee));
      }
    }
    System.out.println();
    System.out.println("Etiquetas de preço: ");

    for (Product prod : list) {
      System.out.println(prod.priceTag());
    }

    sc.close();
  }
}
