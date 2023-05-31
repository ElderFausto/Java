package application;

import model.entities.BusinessClient;
import model.entities.PartnerClient;
import model.entities.User;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class App {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    List<User> list = new ArrayList<>();
    Boolean member = null;
    Boolean memberBusiness = null;

    try {
      System.out.println("Digite quandos pedidos deseja fazer");
      int n = sc.nextInt();

      for (int i = 0; i < n; i++) {
        System.out.println("Digite os dados do usuario!");
        System.out.println("Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Email");
        String email = sc.nextLine();
        System.out.println("Data de nascimento dd/MM/yyyy");
        Date birthday = dateFormat.parse(sc.next());
        System.out.println("Digite o CEP");
        int cep = sc.nextInt();
        System.out.println("Digite o valor do pedido");
        double valueOrder = sc.nextInt();
        System.out.println("O cliente é partner ou business? (p/b)");

        char partnerOrBusiness = sc.next().charAt(0);

        if (partnerOrBusiness == 'p') {
          member = true;
          list.add(new PartnerClient(name, email, birthday, cep, valueOrder, member));

        } else if (partnerOrBusiness == 'b') {
          memberBusiness = true;
          list.add(new BusinessClient(name, email, birthday, cep, valueOrder, memberBusiness));
        } else {
          System.out.println("Por favor digite a letra correta.");
        }
      }
      for (User data : list) {

      }

    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
    sc.close();
  }

}
