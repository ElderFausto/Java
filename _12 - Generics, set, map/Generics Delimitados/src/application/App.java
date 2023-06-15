package application;

import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();
    String path = "E:\\Elder\\elder.txt";

    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
      String line = bufferedReader.readLine();
      while (line != null) {
        String[] fields = line.split(", ");
        list.add(new Product(fields[0], Double.parseDouble(fields[1])));
        line = bufferedReader.readLine();
      }
      Product x = CalculationService.max(list);
      System.out.println("Most expensive: ");
      System.out.println(x);
    } catch (IOException error) {
      System.out.println("Error: " + error.getMessage());
    }
  }
}