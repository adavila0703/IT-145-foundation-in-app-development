package state;

public class StateSingleton {
  public static State state = null;

  public static void newStateSingleton() {
    if (state == null) {
      state = new State(true);
    }
  }
}
