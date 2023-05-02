package application;

import entities.Index;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    Index[] vector = new Index[10];

    System.out.println("Quantos quartos voce quer reservar ?");
    int n = sc.nextInt();

    for (int i = 1; i < n ; i++) {
      System.out.println();
      System.out.println("Reserva #" + i + ":");
      System.out.println("Name: ");
      sc.nextLine();
      String name = sc.nextLine();
      System.out.println("Email: ");
      String email = sc.nextLine();
      System.out.println("Quarto ");
      int room = sc.nextInt();
      vector[room] = new Index(name, email);
    }

    System.out.println();
    System.out.println("Quarto ocupados");
    
    for (int i = 0; i < 10 ; i++) {
      if (vector[i] != null) {
        System.out.println(i + ": " + vector[i]);
      }
    }
    sc.close();
  }
}
