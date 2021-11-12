public class RunningState implements State {
  private Stopwatch stopwatch;

  public RunningState(Stopwatch stopwatch) {
    this.stopwatch = stopwatch;
  }

  @Override
  public void click() {
    stopwatch.setCurrentState(new StopState());
    System.out.println("Stopped");
  }

}
