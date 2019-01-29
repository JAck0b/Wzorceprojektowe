package Stan.Kettle;

public class Second implements FanState {
  @Override
  public void up(Fan fan) {
    fan.setState(this);
  }

  @Override
  public void down(Fan fan) {
    fan.setState(new First());
  }

  @Override
  public String getInfo() {
    return "Second";
  }
}
