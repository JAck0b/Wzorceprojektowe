package Bridge;

public class TV implements SwitchImplementation {
  State state;

  public TV() {
    state = State.OFF;
  }

  @Override
  public void On() {
    System.out.println("TV is turning on.");
    state = State.ON;
  }

  @Override
  public void Off() {
    System.out.println("TV is turning off.");
    state = State.OFF;
  }
}
