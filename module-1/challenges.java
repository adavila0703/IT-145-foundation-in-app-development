import java.util.Random;
import java.util.Scanner;

public class challenges {

  static public void AccelerationOfGravity() {

    /*
     * Compute the acceleration of gravity for a given distance from the earth's
     * center, distCenter, assigning the result to accelGravity.
     * The expression for the acceleration of gravity is: (G * M) / (d^2), where G
     * is the gravitational constant 6.673 x 10-11, M is the mass of the earth 5.98
     * x 1024 (in kg)
     * and d is the distance in meters from the earth's center (stored in variable
     * distCenter). Note: Assume distance is at least the radius of the earth.
     * 
     */
    Scanner scnr = new Scanner(System.in);
    double G = 6.673e-11;
    double M = 5.98e24;
    double accelGravity;
    double distCenter;

    distCenter = scnr.nextDouble();

    accelGravity = (G * M) / Math.pow(distCenter, 2);

    System.out.println(accelGravity);
  }

  static public void DiceRoll() {
    /*
     * Type two statements using nextInt() to print two random integers between (and
     * including) 0 and 9. End with a newline. Ex:
     * 5
     * 7
     * Note: For this activity, using one statement may yield different output (due
     * to the interpreter calling randGen.nextInt() in a different order). Use two
     * statements for this activity. (Notes)
     */

    Scanner scnr = new Scanner(System.in);
    Random randGen = new Random();
    int seedVal;

    seedVal = scnr.nextInt();
    randGen.setSeed(seedVal);

    System.out.println(randGen.nextInt(10));
    System.out.println(randGen.nextInt(10));

  }

  static public void RandomGenerateNumbers() {
    /*
     * Type two statements that use nextInt() to print 2 random integers between
     * (and including) 100 and 149. End with a newline. Ex:
     * 112
     * 102
     * Note: For this activity, using one statement may yield different output (due
     * to the interpreter calling randGen.nextInt() in a different order). Use two
     * statements for this activity.
     */
    Scanner scnr = new Scanner(System.in);
    Random randGen = new Random();
    int seedVal;

    seedVal = scnr.nextInt();
    randGen.setSeed(seedVal);

    System.out.println(randGen.nextInt(50) + 100);
    System.out.println(randGen.nextInt(50) + 100);
  }

  static public void ShippingCalculator() {
    Scanner scnr = new Scanner(System.in);
    int shipWeightPounds;
    int shipCostCents = 0;
    final int FLAT_FEE_CENTS = 75;

    final int CENTS_PER_POUND = 25;

    shipWeightPounds = scnr.nextInt();
    shipCostCents = (CENTS_PER_POUND * shipWeightPounds) + FLAT_FEE_CENTS;

    System.out.println("Weight(lb): " + shipWeightPounds);
    System.out.println("Flat fee(cents): " + FLAT_FEE_CENTS);
    System.out.println("Cents per pound: " + CENTS_PER_POUND);
    System.out.println("Shipping cost(cents): " + shipCostCents);
  }

  static public void scratch() {
    Scanner scnr = new Scanner(System.in);
    char letterToQuit;
    int numPresses;

    letterToQuit = scnr.next().charAt(0);
    numPresses = scnr.nextInt();

    System.out.printf("Press the %c key %d times to quit.", letterToQuit, numPresses);
  }

  public static void main(String args[]) {
    // AccelerationOfGravity();
    // DiceRoll();
    scratch();

  }
}
