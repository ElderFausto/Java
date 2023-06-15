package entities;

public class Product {
 private String name;
 private String brand;
 private Integer year;

 public Product() {};

  public Product(String name, String brand, Integer year) {
    this.name = name;
    this.brand = brand;
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "Product{" +
            "name='" + name + '\'' +
            ", brand='" + brand + '\'' +
            ", year=" + year +
            '}';
  }
}
