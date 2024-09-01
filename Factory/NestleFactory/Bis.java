package Factory.NestleFactory;

import Interface.IChoco;

public class Bis implements IChoco {
  private String weight;

  public Bis(String weight) {
    this.weight = weight;
  }

  @Override
  public String getWeight() {
    return this.weight;
  }

  @Override
  public void setWeight(String weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Peso: " + this.weight;
  }
}
