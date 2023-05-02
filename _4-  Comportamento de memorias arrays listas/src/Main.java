import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    // Aqui define quantos elementes haverá no vetor.
    double[] vector = new double[n];

    // Aqui o laço é chamado, você deve passar os valores
    // para a quantidade de elementos do vetor
    // o [i] se refere a posição dentro do vetor
    // vetor[i]
    for (int i = 0; i < n; i++) {
      vector[i] = sc.nextDouble();
    }
    double sum = 0.0;
    // Aqui como os valores dos vetores ja foram definidos
    // agora eles serão somados
    for (int i = 0; i < n; i++) {
      sum += vector[i];
    }
    // Média
    double avg = sum / n;
    System.out.println("Average: " + avg);

    sc.close();
  }
}