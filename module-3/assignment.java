
public class LogicalTest {
  public static void main(String[] args) {
    int x;

    x = 4;

    if (!((x > 6) || (x < 3))) {
      System.out.println("a");
    }
    if ((x > 7) && (x < 3)) {
      System.out.println("b");
    }
    System.out.println("c");
  }
}