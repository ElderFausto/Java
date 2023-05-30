import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo {
  public static void main(String[] args) {
    method1();
    System.out.println("End of program");
  }

  public static void method1() {
    System.out.println("metodo 1 start");
    method2();
    System.out.println("metodo 1 end");
  }
  public static void method2() {
    System.out.println("metodo 2 start");
    Scanner sc = new Scanner(System.in);
    try {
      String[] vect = sc.nextLine().split(" ");
      int position = sc.nextInt();
      System.out.println(vect[position]);
    } catch (InputMismatchException | ArrayIndexOutOfBoundsException error) {
      System.out.println("Input error");
      error.printStackTrace();
      sc.next();
    }
    sc.close();
    System.out.println("metodo 2 end");
  }
}