package Command;

public class House { // Receiver
  private String walls;
  private String door;

  public House() {
    walls = "White";
    door = "White";
  }

  public void setWalls(String walls) {
    this.walls = walls;
  }


  public void setDoor(String door) {
    this.door = door;
  }

  public String getInfo() {
    return "Walls: " + walls + ", Door: " + door;
  }

  public void doAction(Command command) {
    command.execute(this);
  }
}
