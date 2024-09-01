package Factory.LactaFactory;

import Interface.IChoco;

public class OuroBranco implements IChoco {
  private String weight;

  public OuroBranco(String weight) {
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
