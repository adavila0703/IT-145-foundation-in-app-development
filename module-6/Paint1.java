import java.util.Scanner;

public class Paint1 {

  public static void main(String[] args) {

    double wallHeight = 0.0;
    double wallWidth = 0.0;
    double wallArea = 0.0;
    double gallonsPaintNeeded = 0.0;

    final double squareFeetPerGallons = 350.0;

    // Implement a do-while loop to ensure input is valid
    // Prompt user to input wall's height
    System.out.println("Enter wall height (feet): ");
    do {
      Scanner scnr = new Scanner(System.in);
      try {
        wallHeight = scnr.nextDouble();
      } catch (java.util.InputMismatchException e) {
        System.out.println("Not a valid number, try again.");
      }

      if (wallHeight < 1) {
        System.out.println("Make sure the width is greater than 0.");
      }
    } while (wallHeight <= 0.0);

    // Implement a do-while loop to ensure input is valid
    // Prompt user to input wall's width
    System.out.println("Enter wall width (feet): ");
    do {
      Scanner scnr = new Scanner(System.in);
      try {
        wallWidth = scnr.nextDouble();
      } catch (java.util.InputMismatchException e) {
        System.out.println("Not a valid number, try again.");
      }

      if (wallWidth < 1) {
        System.out.println("Make sure the height is greater than 0.");
      }
    } while (wallWidth <= 0.0);

    // // Calculate and output wall area
    wallArea = wallHeight * wallWidth;
    System.out.printf("Wall area: %s square feet\n", wallArea);

    // // Calculate and output the amount of paint (in gallons) needed to paint the
    // // wall
    gallonsPaintNeeded = wallArea / squareFeetPerGallons;
    System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

  }
}
