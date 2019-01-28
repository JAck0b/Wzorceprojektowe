package Command;

public class PaintWallsCommand implements Command {
  private String color;

  public PaintWallsCommand(String color) {
    this.color = color;
  }

  @Override
  public void execute(House house) {
    house.setWalls(color);
  }
}
