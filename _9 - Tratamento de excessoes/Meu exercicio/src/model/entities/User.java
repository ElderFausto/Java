package model.entities;

import java.util.Date;

public abstract class User {
  private String name;
  private String email;
  private Date birthday;
  private Integer cep;
  private Double valueOrder;

  public User() {};

  public User(String name, String email, Date birthday, Integer cep, Double valueOrder) {
    this.name = name;
    this.email = email;
    this.birthday = birthday;
    this.cep = cep;
    this.valueOrder = valueOrder;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public Integer getCep() {
    return cep;
  }

  public void setCep(Integer cep) {
    this.cep = cep;
  }

  public Double getValueOrder() {
    return valueOrder;
  }

  public void setValueOrder(Double valueOrder) {
    this.valueOrder = valueOrder;
  }

  public abstract Double DiscountForMembers();
}
