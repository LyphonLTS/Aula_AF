package Factory.LactaFactory;

import Interface.IChoco;
import Interface.IChocoFactory;

public class LactaFactory implements IChocoFactory {
  @Override
  public IChoco CreateChoco() {
    return new AoLeite("170g");
  }

  public IChoco CreateOreo() {
    return new Oreo("257g");
  }

  public IChoco CreateSonhoValsa() {
    return new SonhoValsa("277g");
  }

  public IChoco CreateOuroBranco() {
    return new OuroBranco("189g");
  }
}
