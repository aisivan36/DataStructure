public class Main {
  public static void main(String[] args) {
    // passing
    drawUIControl(new TextBox());
    drawUIControl(new CheckBox());
  }

  public static void drawUIControl(UIControl control) {
    control.draw();
  }

}
