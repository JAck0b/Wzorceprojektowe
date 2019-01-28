package Interperter;

public class MainInterperter {
  public static void main(String[] args) {
    Context context = new Context("1010");

    AbstractInterpreter abstractInterpreter = new BinaryInterpreter();
    abstractInterpreter.interprete(context);
    System.out.println(context.getOutput());

    abstractInterpreter = new OctalInterpreter();
    abstractInterpreter.interprete(context);
    System.out.println(context.getOutput());
  }
}
