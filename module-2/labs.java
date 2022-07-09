import java.util.Map;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class labs {

  public static void OutputWithVars() {
    Scanner scnr = new Scanner(System.in);
    int firstNumber;
    int secondNumber;

    System.out.println("Enter integer: ");
    firstNumber = scnr.nextInt();

    double test = Math.pow(firstNumber, 2);
    double test2 = Math.pow(firstNumber, 3);

    System.out.println("You entered: " + firstNumber);
    System.out.printf("%d squared is %d\n", firstNumber, (long) test);
    System.out.printf("And %d cubed is %d!!\n", firstNumber, (long) test2);

    System.out.println("Enter another integer: ");
    secondNumber = scnr.nextInt();

    int sum = firstNumber + secondNumber;
    int product = firstNumber * secondNumber;

    System.out.printf("%d + %d is %d\n", firstNumber, secondNumber, sum);
    System.out.printf("%d * %d is %d\n", firstNumber, secondNumber, product);
    return;
  }

  public static void StringArrOutput(String[] args, boolean reverse) {
    String outString = "";

    if (reverse) {
      for (int i = args.length - 1; i > -1; i--) {
        outString += args[i];
        if (args[0] != args[i]) {
          outString += " ";
        }
      }
    } else {
      for (int i = 0; i < args.length; i++) {
        outString += args[i];
        if (args[args.length - 1] != args[i]) {
          outString += " ";
        }
      }
    }

    System.out.println(outString);
  }

  public static void BasicInput() {
    /*
     * output example
     * Enter integer: 99
     * Enter double: 3.77
     * Enter character: z
     * Enter string: Howdy
     * 99 3.77 z Howdy
     * Howdy z 3.77 99
     * 3.77 cast to an integer is 3
     */
    Scanner scnr = new Scanner(System.in);
    int userInt;
    double userDouble;
    char userCharacter;
    String userString;

    System.out.print("Enter integer: ");
    userInt = scnr.nextInt();

    System.out.print("Enter double: ");
    userDouble = scnr.nextDouble();

    System.out.print("Enter character: ");
    userCharacter = scnr.next().charAt(0);

    System.out.print("Enter string: ");
    userString = scnr.next();

    String[] stringArr = {
        Integer.toString(userInt),
        Double.toString(userDouble),
        Character.toString(userCharacter),
        userString
    };

    StringArrOutput(stringArr, false);
    StringArrOutput(stringArr, true);

    System.out.printf("%.2f cast to an integer is %d\n", userDouble, (int) userDouble);
    return;
  }

  public static void ZillowOutput() {
    /*
     * Sites like Zillow get input about house prices from a database and provide
     * nice summaries for readers. Write a program with two inputs, current price
     * and last month's price (both integers). Then, output a summary listing the
     * price, the change since last month, and the estimated monthly mortgage
     * computed as (currentPrice * 0.051) / 12 (Note: Output directly. Do not store
     * in a variable.).
     * 
     * Ex: If the input is:
     * 
     * 200000 210000
     * the output is:
     * 
     * This house is $200000. The change is $-10000 since last month.
     * The estimated monthly mortgage is $850.0.
     * 
     * Note: Getting the precise spacing, punctuation, and newlines exactly right is
     * a key point of this assignment. Such precision is an important part of
     * programming.
     */

    Scanner scnr = new Scanner(System.in);

    int currentPrice = scnr.nextInt();
    int lastMonthsPrice = scnr.nextInt();
    int priceChange = currentPrice - lastMonthsPrice;
    double monthlyMortgage = (currentPrice * 0.051) / 12;

    System.out.printf(
        "This house is $%d. The change is $%d since last month.\nThe estimated monthly mortgage is $%.1f.\n",
        currentPrice, priceChange, monthlyMortgage);

  }

  public static void Arrow() {
    /*
     * 1.42 LAB: Input and formatted output: Right-facing arrow
     * Given two input integers for an arrowhead and arrow body, print a
     * right-facing arrow.
     * 
     * Ex: If the input is:
     * 
     * 0 1
     * the output is:
     * 
     * -----1
     * -----11
     * 00000111
     * 000001111
     * 00000111
     * -----11
     * -----1
     */

    Scanner scnr = new Scanner(System.in);
    int baseChar;
    int headChar;

    Map test = new Map<string, string>();

    /* Type your code here. */
  }

  public static void main(String args[]) {
    // OutputWithVars();
    // BasicInput();
    ZillowOutput();
  }
}
