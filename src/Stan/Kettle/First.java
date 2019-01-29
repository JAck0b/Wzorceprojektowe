package Stan.Kettle;

public class First implements FanState {
  @Override
  public void up(Fan fan) {
    fan.setState(new Second());
  }

  @Override
  public void down(Fan fan) {
    fan.setState(new Off());
  }

  @Override
  public String getInfo() {
    return "First";
  }
}
