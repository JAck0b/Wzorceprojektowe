package Bridge;

public class ClickSwitch extends Switch {

  public ClickSwitch(SwitchImplementation device) {
    super(device);
  }

  @Override
  void On() {
    device.On();
  }

  @Override
  void Off() {
    device.Off();
  }
}
