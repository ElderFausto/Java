import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    File file = new File("E:\\Elder\\elder.txt");
    Scanner sc = null;

    try {
      sc = new Scanner(file);
      while (sc.hasNextLine()) {
        System.out.println(sc.nextLine());
      }
    } catch (IOException error) {
      System.out.println("Error: " + error.getMessage());
    } finally {
      if (sc != null) {
        sc.close();
      }
    }
  }
}