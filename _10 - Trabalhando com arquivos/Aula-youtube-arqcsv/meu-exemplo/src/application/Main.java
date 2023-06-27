package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    String path = "E:\\elder\\elder.txt";
    List<Product> list = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();
      while (line != null) {
        String[] vect = line.split(", ");
        String name = vect[0];
        String brand = vect[1];
        Integer year = Integer.valueOf(vect[2]);

        Product product = new Product(name, brand, year);
        list.add(product);
        line = br.readLine();
      }
      System.out.println("Products");
      for (Product p : list) {
        System.out.println(p);
      }
    } catch (IOException error) {
      error.printStackTrace();
    }
  }
}
