package Command;

public class PaintDoorCommand implements Command {
  private String color;

  public PaintDoorCommand(String color) {
    this.color = color;
  }
  @Override
  public void execute(House house) {
    house.setDoor(color);
  }
}
