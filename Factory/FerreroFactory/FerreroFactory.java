package Factory.FerreroFactory;

import Interface.IChoco;
import Interface.IChocoFactory;

public class FerreroFactory implements IChocoFactory {
  public IChoco CreateChoco() {
    return new Rondnoir("137g");
  }

  public IChoco CreateRocher() {
    return new Rocher("225g");
  }

  public IChoco CreateRaffaello() {
    return new Raffaello("366g");
  }
}
