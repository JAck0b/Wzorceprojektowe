package Bridge;

public class Radio implements SwitchImplementation {
  State state;

  public Radio() {
    state = State.OFF;
  }

  @Override
  public void On() {
    System.out.println("Radio is turning on.");
    state = State.ON;
  }

  @Override
  public void Off() {
    System.out.println("Radio is turning off.");
    state = State.OFF;
  }
}
