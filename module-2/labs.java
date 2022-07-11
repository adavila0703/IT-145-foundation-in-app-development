import java.util.Scanner;

public class labs {
  /*
   * 2.17 LAB: Driving cost - methods
   * Write a method drivingCost() with input parameters milesPerGallon,
   * dollarsPerGallon, and milesDriven that returns the dollar cost to drive those
   * miles. All items are of type double. The method called with arguments (20.0,
   * 3.1599, 50.0) returns 7.89975.
   * 
   * Define that method in a program whose inputs are the car's miles per gallon
   * and the price of gas in dollars per gallon (both doubles). Output the gas
   * cost for 10 miles, 50 miles, and 400 miles, by calling your drivingCost()
   * method three times.
   * 
   * Output each floating-point value with two digits after the decimal point,
   * which can be achieved as follows:
   * System.out.printf("%.2f", yourValue);
   * 
   * The output ends with a newline.
   * 
   * Ex: If the input is:
   * 
   * 20.0 3.1599
   * the output is:
   * 
   * 1.58 7.90 63.20
   * Your program must define and call a method:
   * public static double drivingCost(double milesPerGallon, double
   * dollarsPerGallon, double milesDriven)
   */
  public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
    double carEcon = carFuelEcon(milesPerGallon, dollarsPerGallon);
    return carEcon * milesDriven;
  }

  public static double carFuelEcon(double milesPerGallon, double dollarsPerGallon) {
    return dollarsPerGallon / milesPerGallon;
  }

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);
    double milesPerGallon = scnr.nextFloat();
    double dollarsPerGallon = scnr.nextFloat();

    double firstTrip = drivingCost(milesPerGallon, dollarsPerGallon, 10);
    double secondTrip = drivingCost(milesPerGallon, dollarsPerGallon, 50);
    double thirdTrip = drivingCost(milesPerGallon, dollarsPerGallon, 400);

    System.out.printf("%.2f", firstTrip);
    System.out.printf("%.2f", secondTrip);
    System.out.printf("%.2f", thirdTrip);

  }
}
