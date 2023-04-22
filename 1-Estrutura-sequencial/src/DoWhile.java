import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    char resp;

    do {
      System.out.println("Enter the temperature in Celsius");
      double C = sc.nextDouble();
      double F = 9.0 * C / 5.0 + 32.0;

      System.out.printf("Equality in Fahrenheit: %.2f%n", F);
      System.out.print("Want to repeat? (s/n) ?");
      resp = sc.next().charAt(0);
    } while (resp != 'n');

    System.out.println("Good Bye!");
    sc.close();
  }
}
