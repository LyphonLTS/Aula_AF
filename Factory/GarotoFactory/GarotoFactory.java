package Factory.GarotoFactory;

import Interface.IChoco;
import Interface.IChocoFactory;

public class GarotoFactory implements IChocoFactory {
  public IChoco CreateChoco() {
    return new Crocante("215g");
  }

  public IChoco CreateTalento() {
    return new Talento("350g");
  }

  public IChoco CreateBatomLeite() {
    return new BatomLeite("172g");
  }

  public IChoco CreateCaribe() {
    return new Caribe("115g");
  }
}
