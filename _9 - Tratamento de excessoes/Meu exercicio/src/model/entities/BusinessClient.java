package model.entities;

import model.exceptions.UserException;

import java.util.Date;

public class BusinessClient extends User {
  private Boolean memberBusiness;
  private Double discountBusiness;
  public BusinessClient(String name, String email, Date birthday, int cep, double valueOrder, Boolean memberBusiness) {
    super();
  }

  public BusinessClient(String name, String email, Date birthday, Integer cep, Double valueOrder, Boolean memberBusiness, Double discountBusiness) {
    super(name, email, birthday, cep, valueOrder);
    this.memberBusiness = memberBusiness;
    this.discountBusiness = discountBusiness;
  }


  @Override
  public Double DiscountForMembers() {
    if (memberBusiness == true) {
      return getValueOrder() * 0.30 - discountBusiness * 0.8;
    } else {
      return getValueOrder();
    }
  }

  public void messageError() {
    if (!memberBusiness) {
      throw new UserException("Usuario não é empresario");
    }
  }
}
