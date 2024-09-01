package Factory.LactaFactory;

import Interface.IChoco;

public class AoLeite implements IChoco {
  private String weight;

  public AoLeite(String weight) {
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
