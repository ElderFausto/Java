package entities;

public class CLT extends TaxPayer {

  public Double healthExpenditures;

  public CLT(String name, Double anualIncome, Double healthExpenditures) {
    super(name, anualIncome);
    this.healthExpenditures = healthExpenditures;
  }

  @Override
  public Double tax() {
    if (getAnualIncome() < 20000.0) {
      return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
    } else {
      return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
    }
  }
}
