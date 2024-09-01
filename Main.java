import Factory.FerreroFactory.FerreroFactory;
import Factory.GarotoFactory.GarotoFactory;
import Factory.HersheyFactory.HersheyFactory;
import Factory.LactaFactory.LactaFactory;
import Factory.NestleFactory.NestleFactory;
import Interface.IChoco;

class Main {
  public static void main(String[] args) {
    FerreroFactory ferrero = new FerreroFactory();
    GarotoFactory garoto = new GarotoFactory();
    HersheyFactory hershey = new HersheyFactory();
    LactaFactory lacta = new LactaFactory();
    NestleFactory nestle = new NestleFactory();

    System.out.println("Fabrica da Garoto");
    IChoco batom = ((GarotoFactory) garoto).CreateBatomLeite();
    IChoco crocante = ((GarotoFactory) garoto).CreateChoco();
    IChoco talento = ((GarotoFactory) garoto).CreateTalento();

    System.out.println("Batom - " + batom.toString() + "\n");
    System.out.println("Crocante - " + crocante.toString() + "\n");
    System.out.println("Talento - " + talento.toString() + "\n");

    System.out.println("Fabrica da Lacta");
    IChoco ouroBranco = ((LactaFactory) lacta).CreateOuroBranco();

    System.out.println("Ouro Branco - " + ouroBranco.toString() + "\n");

    System.out.println("Fabrica da Ferrero");
    IChoco rondnoir = ((FerreroFactory) ferrero).CreateChoco();

    System.out.println("Rondnoir - " + rondnoir.toString() + "\n");

    System.out.println("Fabrica da Hershey");
    IChoco menta = ((HersheyFactory) hershey).CreateMenta();

    System.out.println("Menta - " + menta.toString() + "\n");

    System.out.println("Fabrica da Nestle");
    IChoco bis = ((NestleFactory) nestle).CreateBis();

    System.out.println("Bis - " + bis.toString() + "\n");
  }
}
