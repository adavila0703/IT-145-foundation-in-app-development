import java.util.Scanner;

public class challenges {

  public static void SafteyFeatures() {
    int carYear;

    Scanner input = new Scanner(System.in);
    carYear = input.nextInt();
    if (carYear < 1968) {
      System.out.println("Probably has few safety features.");
    }
    if (carYear > 1971) {
      System.out.println("Probably has seat belts.");
    }
    if (carYear > 1991) {
      System.out.println("Probably has anti-lock brakes.");
    }
    if (carYear > 2000) {
      System.out.println("Probably has airbags.");
    }
  }

  public static void main(String[] args) {

  }
}
