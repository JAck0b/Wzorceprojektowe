package Stan.Kettle;

public interface FanState {
  void up(Fan fan);
  void down(Fan fan);
  String getInfo();
}
