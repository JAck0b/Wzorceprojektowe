package Bridge;

public abstract class Switch {
  SwitchImplementation device; // Kluczowe połączenie (most)

  public Switch(SwitchImplementation device) {
    this.device = device;
  }

  abstract void On();
  abstract void Off();
}
