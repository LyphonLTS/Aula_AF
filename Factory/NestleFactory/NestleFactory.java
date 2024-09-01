package Factory.NestleFactory;

import Interface.IChoco;
import Interface.IChocoFactory;

public class NestleFactory implements IChocoFactory {
  public IChoco CreateChoco() {
    return new Alpino("337g");
  }

  public IChoco CreateClassic() {
    return new Classic("185g");
  }

  public IChoco CreateKitKat() {
    return new KitKat("172g");
  }

  public IChoco CreateBis() {
    return new Bis("120g");
  }
}
