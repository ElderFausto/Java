import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();

        System.out.println("Voce digitou: " + x);

        sc.close();
    }
}
