package Factory.FerreroFactory;

import Interface.IChoco;

public class Rocher implements IChoco {
  private String weight;

  public Rocher(String weight) {
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
