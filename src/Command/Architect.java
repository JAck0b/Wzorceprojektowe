package Command;

public class Architect { // Invoker
  public Architect() {}

  public void paintWalls(House house, String color) {
    Command command = new PaintWallsCommand(color);
    house.doAction(command);
    // można chyba też po prostu dać
    // command.execute(house);
  }

  public void paintDoor(House house, String color) {
    Command command = new PaintDoorCommand(color);
    house.doAction(command);
    // można chyba też po prostu dać
    // command.execute(house);
  }
}
