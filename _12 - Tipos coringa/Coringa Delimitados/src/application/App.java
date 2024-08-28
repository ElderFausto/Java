package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    List<Shape> myShapes = new ArrayList<>();
    myShapes.add(new Rectangle(3.0, 2.0));
    myShapes.add(new Circle(2.0));

    List<Circle> myCircle = new ArrayList<>();
    myCircle.add(new Circle(2.0));
    myCircle.add(new Circle(3.0));

    System.out.println("Total area: " + totalArea(myCircle));
  }

  public static double totalArea(List<? extends Shape> list) {
    double sum = 0.0;
    for (Shape s : list) {
      sum += s.area();
    }
    return sum;
  }
}

/*
package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
    List<Double> myDoubles = Arrays.asList(3.14, 6.28);
    List<Object> myObjs = new ArrayList<Object>();

    copy(myInts, myObjs);
    printList(myObjs);
    copy(myDoubles, myObjs);
    printList(myObjs);
  }

  public static void copy(List<? extends Number> source, List<? super Number> destiny) {
    for (Number number : source) {
      destiny.add(number);
    }
  }

  public static void printList(List<?> list) {
    for (Object obj : list) {
      System.out.print(obj + " ");
    }
    System.out.println();
  }
}
 */
