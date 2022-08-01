
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
      if (i == 0) {
        arrMessage += arr[i].toString();
        continue;
      }
      arrMessage += " " + arr[i].toString();
    }
    arrMessage += "\n";
    System.out.printf(startingMessage, arrMessage);
  }

  public static Double addWeights(Double[] arr, double startingValue) {
    Double summation = startingValue;
    for (int i = 0; i < arr.length; i++) {
      summation += arr[i];
    }
    return summation;
  }

  public static Double averageWeights(Double[] arr, double startingValue) {
    Double summation = startingValue;
    for (int i = 0; i < arr.length; i++) {
      summation += arr[i];
    }
    return summation / arr.length;
  }

  public static Double maxWeight(Double[] arr, double startingValue) {
    Double value = startingValue;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > value) {
        value = arr[i];
      }
    }
    return value;
  }

  public static Double[] getWeights(Integer numberOfWeights, Scanner scnr) {
    Double[] weights = new Double[numberOfWeights];
    String message = "Enter weight %s: ";

    for (int i = 1; i < numberOfWeights + 1; i++) {
      System.out.printf(message, i);
      Double weight = scnr.nextDouble();
      weights[i - 1] = weight;
    }

    return weights;
  }

  public static void peopleWeights() {
    Scanner scnr = new Scanner(System.in);

    Double[] weights = getWeights(5, scnr);

    printArray(weights, "\nYou entered: %s");

    Double startingValue = 0.0;

    Double sumWeights = addWeights(weights, startingValue);
    Double averageWeights = averageWeights(weights, startingValue);
    Double maxWeight = maxWeight(weights, startingValue);

    System.out.printf("Total weight: %s\n", sumWeights);
    System.out.printf("Average weight: %s\n", averageWeights);
    System.out.printf("Max weight: %s\n", maxWeight);
  }

  public static void main(String[] args) {
    peopleWeights();
  }
}
