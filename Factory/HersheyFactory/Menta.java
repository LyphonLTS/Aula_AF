package Factory.HersheyFactory;

import Interface.IChoco;

public class Menta implements IChoco {
  private String weight;

  public Menta(String weight) {
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
