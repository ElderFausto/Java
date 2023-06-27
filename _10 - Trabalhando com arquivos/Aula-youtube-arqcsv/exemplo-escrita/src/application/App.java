package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
  public static void main(String[] args) {
    String path = "E:\\elder\\elder.txt";
    String[] lines = new String[] {"gol, quadrado, 2000"};

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
      for (String line : lines) {
        bw.write(line);
        bw.newLine();
      }
    } catch (IOException error) {
      System.out.println(error.getMessage());
    }
  }
}
