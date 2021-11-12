public class Stopwatch {

  private State currentState = new StopState(this); // "this" parameter it belongs the current object is meant
                                                    // "stopwatch"

  public void click() {
    currentState.click();
  }

  public State getCurrentState() {
    return currentState;
  }

  public void setCurrentState(State currentState) {
    this.currentState = currentState;
  }

}
