package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Programa3 {
  public static void main(String[] args) {
    String path = "E:\\elder\\elder.txt";
    List<Product> list = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      String line = br.readLine();
      line = br.readLine();
      while (line != null) {

        String[] vect = line.split(",");
        String name = vect[0];
        Double price = Double.parseDouble(vect[1]);
        Integer qtd = Integer.parseInt(vect[2]);

        Product prod = new Product(name, price, qtd);
        list.add(prod);

        line = br.readLine();
      }
      System.out.println("Products: ");
      for (Product p : list) {
        System.out.println(p);
      }
    } catch (IOException error) {
      System.out.println("Error: " + error.getMessage());
    }
  }
}
