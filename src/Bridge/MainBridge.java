package Bridge;

public class MainBridge {
  public static void main(String[] args) {
    Switch radioSwitch = new ClickSwitch(new Radio());
    Switch tvSwitch = new ClickSwitch(new TV());

    radioSwitch.On();
    radioSwitch.Off();

    tvSwitch.Off();
    tvSwitch.On();
  }
}
