package entities;

public class Rectangle implements Shape {
  private double width;
  private double height;

  public Rectangle(double height, double width) {
    this.height = height;
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  @Override
  public double area() {
    return width * height;
  }
}
