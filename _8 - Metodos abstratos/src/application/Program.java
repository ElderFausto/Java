package application;

import entities.Shape;
import entities.enums.Color;
import entities.Rectangle;
import entities.Circle;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    List<Shape> list = new ArrayList<>();

    System.out.println("Digite o numero de formas: ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.println("Forma #" + i + " data:");
      System.out.println("Retangulo ou circulo (r/c)? ");
      char ch = sc.next().charAt(0);
      System.out.println("Cor (BLACK/BLUE/RED): ");
      Color color = Color.valueOf(sc.next());

      if (ch == 'r') {
        System.out.println("Largura: ");
        double width = sc.nextDouble();
        System.out.println("Altura: ");
        double height = sc.nextDouble();
        list.add(new Rectangle(color, width, height));
      } else {
        System.out.println("Raio: ");
        double radius = sc.nextDouble();
        list.add(new Circle(color, radius));
      }
    }
    System.out.println();
    System.out.println("AREAS");
    for (Shape shape : list) {
      System.out.println(String.format("%.2f", shape.area()));
    }

    sc.close();
  }
}
