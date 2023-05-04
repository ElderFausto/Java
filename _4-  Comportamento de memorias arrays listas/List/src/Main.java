import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("Elder");
    list.add("Joao");
    list.add("Pedro");
    list.add("Vitoria");

    for (String names : list) {
      System.out.println(names);
    }

    list.add(0, "Maria");
    list.remove("Pedro");
//    list.removeIf(names -> names.charAt(0) == "E");

    for (String names : list) {
      System.out.println(names);
    }

    System.out.println(list);
    System.out.println(list.size());

    List<String> result = list.stream().filter(names -> names.charAt(0) == 'V').collect(Collectors.toList());
    for (String names : result) {
      System.out.println(result);
    }

    // name = list.stream().filter(x -> x.charAt(0) == "J").findFirst().orElse(null);
  }
}

