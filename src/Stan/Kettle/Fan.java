package Stan.Kettle;

public class Fan {
  FanState state;

  public Fan() {
    state = new Off();
  }

  void up() {
    state.up(this);
  }

  void down() {
    state.down(this);
  }

  void getState() {
    System.out.println("State: " + state.getInfo());
  }

  void setState(FanState fanState) {
    this.state = fanState;
  }
}
