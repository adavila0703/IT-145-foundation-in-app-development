import java.util.Scanner;

public class RangeDetector {
  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    int x;

    x = scnr.nextInt();

    if (x < 5) {
      System.out.println("t");
    } else if (x == 5) {
      System.out.println("f");
    } else if (x <= 25) {
      System.out.println("i");
    } else {
      System.out.println("d");
    }
  }
}