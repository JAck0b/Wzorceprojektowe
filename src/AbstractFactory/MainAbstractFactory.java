package AbstractFactory;

public class MainAbstractFactory {
  public static void main(String[] args) {
    Kanapka kanapka = new Kanapka(new KanapkaMiesnaFabryka());
    System.out.println(kanapka.getOpis());
    Kanapka kanapka1 = new Kanapka(new KanapkaWegeFabryka());
    System.out.println(kanapka1.getOpis());
  }
}
