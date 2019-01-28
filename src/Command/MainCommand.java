package Command;

public class MainCommand {
  public static void main (String[] args) {
    Owner owner = new Owner();
    owner.getInfoAboutHouse();
    owner.paintDoor("Blue");
    owner.getInfoAboutHouse();
    owner.paintWalls("Yellow");
    owner.getInfoAboutHouse();
  }
}
