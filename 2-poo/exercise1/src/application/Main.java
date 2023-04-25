package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Rectangle rectangle = new Rectangle();

    System.out.println("Digite a largura do retangulo");
    rectangle.width = sc.nextDouble();

    System.out.println("Digite a altura do retangulo");
    rectangle.height = sc.nextDouble();

    System.out.printf("A area do retangulo é %.2f%n", rectangle.area());
    System.out.printf("O perimetro é, %.2f%n", rectangle.perimeter());
    System.out.printf("A diagonal é é, %.2f%n", rectangle.diagonal());
    sc.close();
  }
}