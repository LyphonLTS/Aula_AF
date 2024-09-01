package Factory.FerreroFactory;

import Interface.IChoco;

public class Rondnoir implements IChoco {
  private String weight;

  public Rondnoir(String weight) {
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
