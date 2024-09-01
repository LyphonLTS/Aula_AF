package Factory.GarotoFactory;

import Interface.IChoco;

public class Crocante implements IChoco {
  private String weight;

  public Crocante(String weight) {
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
