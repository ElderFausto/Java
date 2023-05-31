package model.entities;

import model.exceptions.UserException;

import java.util.Date;

public class PartnerClient extends User {

  private Boolean member;
  private Double discount;

  public PartnerClient(String name, String email, Date birthday, int cep, double valueOrder, Boolean member) {
    super();
  };

  public PartnerClient(String name, String email, Date birthday, Integer cep, Double valueOrder, Boolean member, Double discount) {
    super(name, email, birthday, cep, valueOrder);
    this.member = member;
    this.discount = discount;
  }

  @Override
  public Double DiscountForMembers() {
    if (member == true) {
      return getValueOrder() * 0.10 - discount * 0.5;
    } else {
      return getValueOrder();
    }
  }

  public void messageError() {
    if (!member) {
      throw new UserException("Usuario nao é sócio");
    }
  }


}
