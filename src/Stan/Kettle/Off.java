package Stan.Kettle;

public class Off implements FanState {
  @Override
  public void up(Fan fan) {
    if (Counter.getCounter() < 2) {
      fan.setState(new First());
      Counter.incCounter();
    } else {
      fan.setState(this);
    }
  }

  @Override
  public void down(Fan fan) {
    fan.setState(this);
  }

  @Override
  public String getInfo() {
    return "Off";
  }
}
