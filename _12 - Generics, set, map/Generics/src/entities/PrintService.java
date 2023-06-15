package entities;

import java.util.ArrayList;
import java.util.List;

public class PrintService<TGeneric> {
  List<TGeneric> list = new ArrayList<>();

  public void addValue(TGeneric value) {
    list.add(value);
  }

  public TGeneric first() {
    if(list.isEmpty()) {
      throw new IllegalStateException("List is empty");
    }
    return list.get(0);
  }

  public void print() {
    System.out.println("[");
    if (!list.isEmpty()) {
      System.out.println(list.get(0));
    }
    for (int i = 0; i < list.size(); i++) {
      System.out.println(", " + list.get(i));
    }
    System.out.println("]");
  }
}
