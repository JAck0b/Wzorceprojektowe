package Interperter;

public class OctalInterpreter implements AbstractInterpreter {
  @Override
  public void interprete(Context context) {
    int output = context.getInput().charAt(0) - '0';
    for (int i = 1; i < context.getInput().length(); i++) {
      output = output*8 + context.getInput().charAt(i) - '0';
    }
    context.setOutput(output);
  }
}
