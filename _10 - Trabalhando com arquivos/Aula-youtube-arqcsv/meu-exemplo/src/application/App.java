package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    // 1- primeiro de tudo colocar o caminho do arquivo
    String path = "E:\\elder\\elder.txt";
    // 2- chamar uma lista para guardar os dados
    List<Product> list = new ArrayList<>();
    // 3- chamar o try e catch, passando o bufferedReader e filereader, passando o caminho
    // do path no filereader
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      // 4- é criar uma variavel para ler os dados do arquivo
      String line = br.readLine();
      line = br.readLine();
      // 5- chamar o while para ler todo o arquivo
      while (line != null) {
        String[] vect = line.split(",");
        String name = vect[0];
        String brand = vect[1];
        Integer year  = Integer.valueOf(vect[2]);

        Product prod = new Product(name, brand, year);
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
