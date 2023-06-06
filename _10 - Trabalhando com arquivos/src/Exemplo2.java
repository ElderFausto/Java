import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo2 {
  public static void main(String[] args) {
    String path = "E:\\elder\\elder.txt";
    FileReader fr = null;
    BufferedReader br = null;

    try {
      fr = new FileReader(path);
      br = new BufferedReader(fr);

      String line = br.readLine();
      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException error) {
      System.out.println("Error: " + error.getMessage());
    } finally {
      try {
        if (br != null) {
          br.close();
        }
        if (fr != null) {
          fr.close();
        }
      } catch (IOException error) {
        error.printStackTrace();
      }
    }
  }
}
