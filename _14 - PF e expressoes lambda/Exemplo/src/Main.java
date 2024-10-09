import entities.Product;
import model.services.ProductServices;

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

    ProductServices ps = new ProductServices();

    double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

    System.out.println("Sum = " + String.format("%.2f", sum));
  }
}