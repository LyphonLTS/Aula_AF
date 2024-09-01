package Factory.HersheyFactory;

import Interface.IChoco;
import Interface.IChocoFactory;

public class HersheyFactory implements IChocoFactory {
  public IChoco CreateChoco() {
    return new Tradicional("137g");
  }

  public IChoco CreateCranberry() {
    return new Cranberry("225g");
  }

  public IChoco CreateMenta() {
    return new Menta("366g");
  }
}
