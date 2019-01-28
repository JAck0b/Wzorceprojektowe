package Command;

public class Owner { // Client
  private House house;
  private Architect architect;

  public Owner() {
    house = new House();
    architect = new Architect();
  }

  public void paintWalls(String color) {
    architect.paintWalls(house, color);
  }

  public void paintDoor(String color) {
    architect.paintDoor(house, color);
  }

  public void getInfoAboutHouse() {
    System.out.println(house.getInfo());
  }
}
