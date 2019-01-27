package Builder;

import java.util.ArrayList;

// W przyszłości pizza mogłaby dziedziczyć po czymś, aby było bardziej uniwersalne
public class Pizza extends Jedzonko{
  private ArrayList<String> dodatki;
  private boolean seroweBrzegi;
  private String sos;

  public Pizza() {
    dodatki = new ArrayList<>();
  }

  public ArrayList<String> getDodatki() {
    return dodatki;
  }

  public void setDodatki(ArrayList<String> dodatki) {
    this.dodatki = dodatki;
  }

  public boolean isSeroweBrzegi() {
    return seroweBrzegi;
  }

  public void setSeroweBrzegi(boolean seroweBrzegi) {
    this.seroweBrzegi = seroweBrzegi;
  }

  public String getSos() {
    return sos;
  }

  public void setSos(String sos) {
    this.sos = sos;
  }

  @Override
  public void zbudujOpis() {
    opis = nazwa + ": ";
    for(String x: dodatki) {
      opis = opis + x + ", ";
    }
    opis = opis + "sos: " + sos + "serowe brzegi: " + seroweBrzegi;
  }

  @Override
  public void wypiszOpis() {
    System.out.println(opis);
  }
}
