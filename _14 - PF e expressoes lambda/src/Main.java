import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();

    list.add(new Product("TV", 900.00));
    list.add(new Product("Mouse", 50.00));
    list.add(new Product("Shirt", 70.00));
    list.add(new Product("Notebook", 1200.00));
    list.add(new Product("Tablet", 450.00));

    // list.removeIf(Product::staticProductPredicate);

    list.removeIf(p -> p.getPrice() >= 100);

    for (Product p : list) {
      System.out.println(p);
    }
  }
}