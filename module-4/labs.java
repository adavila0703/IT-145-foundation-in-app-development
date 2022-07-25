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

  public static Double[] GetWeights(Integer numberOfWeights, Scanner scnr) {
    Double[] weights;
    String message = "Enter weight %s: ";

    for (int i = 0; i < numberOfWeights; i++) {
      System.out.printf(message, i);
      weights.
      scnr.nextDouble();
    }

    return weights
  }

  public static void PeopleWeights() {
    Scanner scnr = new Scanner(System.in);

  }

  public static void main(String[] args) {
    PeopleWeights();
  }
}
