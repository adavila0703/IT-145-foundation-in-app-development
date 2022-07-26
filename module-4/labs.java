import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class labs {

  /*
   * (1) Prompt the user to enter five numbers, being five people's weights. Store
   * the numbers in an array of doubles. Output the array's numbers on one line,
   * each number followed by one space. (2 pts)
   * 
   * Ex:
   * 
   * Enter weight 1: 236
   * Enter weight 2: 89.5
   * Enter weight 3: 142
   * Enter weight 4: 166.3
   * Enter weight 5: 93
   * 
   * You entered: 236.0 89.5 142.0 166.3 93.0
   * (2) Also output the total weight, by summing the array's elements. (1 pt)
   * 
   * (3) Also output the average of the array's elements. (1 pt)
   * 
   * (4) Also output the max array element. (2 pts)
   * 
   * 
   * Ex:
   * 
   * Enter weight 1: 236
   * Enter weight 2: 89.5
   * Enter weight 3: 142
   * Enter weight 4: 166.3
   * Enter weight 5: 93
   * 
   * You entered: 236.0 89.5 142.0 166.3 93.0
   * Total weight: 726.8
   * Average weight: 145.35999999999999
   * Max weight: 236.0
   */

  public static <T> void printArray(T[] arr, String startingMessage) {
    String arrMessage = "";
    for (int i = 0; i < arr.length; i++) {
      arrMessage += " " + arr[i].toString();
    }
    arrMessage += "\n";
    System.out.printf(startingMessage, arrMessage);
  }

  public static <T> T addArray(T[] arr, T startingValue) {
    T summation = startingValue;
    for (int i = 0; i < arr.length; i++) {
      if (summation.getClass() == Double.class) {
        (T) (Double) summation += (Double) arr[i];
      }
    }
    return summation;
  }

  public static <T> void addArray(T[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]);
    }
  }

  public static Double[] getWeights(Integer numberOfWeights, Scanner scnr) {
    Double[] weights = new Double[numberOfWeights];
    String message = "Enter weight %s:";

    for (int i = 1; i < numberOfWeights + 1; i++) {
      System.out.printf(message, i);
      Double weight = scnr.nextDouble();
      weights[i - 1] = weight;
    }

    printArray(weights, "You entered: %s");

    return weights;
  }

  public static void peopleWeights() {
    Scanner scnr = new Scanner(System.in);

    Double[] weights = getWeights(5, scnr);

    Double startingValue = 0.0;

    Double sumWeights = addArray(weights, startingValue);

    System.out.println(sumWeights);

  }

  public static void main(String[] args) {
    peopleWeights();
  }
}
