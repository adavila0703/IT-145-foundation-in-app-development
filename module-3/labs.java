import java.util.HashMap;
import java.util.Scanner;

public class labs {
  /*
   * This program outputs a downwards facing arrow composed of a rectangle and a
   * right triangle. The arrow dimensions are defined by user specified arrow base
   * height, arrow base width, and arrow head width.
   * 
   * (1) Modify the given program to use a loop to output an arrow base of height
   * arrowBaseHeight. (1 pt)
   * 
   * (2) Modify the given program to use a loop to output an arrow base of width
   * arrowBaseWidth. Use a nested loop in which the inner loop draws the *’s, and
   * the outer loop iterates a number of times equal to the height of the arrow
   * base. (1 pt)
   * 
   * (3) Modify the given program to use a loop to output an arrow head of width
   * arrowHeadWidth. Use a nested loop in which the inner loop draws the *’s, and
   * the outer loop iterates a number of times equal to the height of the arrow
   * head. (2 pts)
   * 
   * (4) Modify the given program to only accept an arrow head width that is
   * larger than the arrow base width. Use a loop to continue prompting the user
   * for an arrow head width until the value is larger than the arrow base width.
   * (1 pt)
   * 
   * while (arrowHeadWidth <= arrowBaseWidth) {
   * // Prompt user for a valid arrow head value
   * }
   * 
   * 
   * Example output for arrowBaseHeight = 5, arrowBaseWidth = 2, and
   * arrowHeadWidth = 4:
   * 
   * Enter arrow base height:
   * 5
   * Enter arrow base width:
   * 2
   * Enter arrow head width:
   * 4
   **
   **
   **
   **
   **
   ****
   ***
   **
   *
   * 
   * 
   */

  public static String repeatCharacter(String character, int count) {
    return new String(new char[count]).replace("\0", character);
  }

  public static void DrawArrowBase(String character, Integer height, Integer width) {
    for (int i = 0; i < height; i++) {
      System.out.println(repeatCharacter(character, width));
    }
  }

  public static void DrawArrowHead(String character, Integer width) {
    for (int i = width; i > 0; i--) {
      System.out.println(repeatCharacter(character, i));
    }
  }

  public static void DrawHalfArrow() {
    Scanner scnr = new Scanner(System.in);
    int arrowBaseHeight;
    int arrowBaseWidth;
    int arrowHeadWidth;
    String character = "*";

    System.out.println("Enter arrow base height:");
    arrowBaseHeight = scnr.nextInt();

    System.out.println("Enter arrow base width:");
    arrowBaseWidth = scnr.nextInt();

    System.out.println("Enter arrow head width:");
    arrowHeadWidth = scnr.nextInt();
    while (arrowHeadWidth <= arrowBaseWidth) {
      System.out.println("Enter arrow head width:");
      arrowHeadWidth = scnr.nextInt();
    }
    System.out.println("");

    DrawArrowBase(character, arrowBaseHeight, arrowBaseWidth);
    DrawArrowHead(character, arrowHeadWidth);
  }

  /*
   * Given a line of text as input, output the number of characters excluding
   * spaces, periods, exclamation points, or commas.
   * 
   * Ex: If the input is:
   * 
   * Listen, Mr. Jones, calm down.
   * the output is:
   * 
   * 21
   * Note: Account for all characters that aren't spaces, periods, exclamation
   * points, or commas (Ex: "r", "2", "?").
   */

  public static Integer CountCharacters(HashMap<String, String> ignoreList, String userText) {
    Integer count = 0;
    for (Character character : userText.toCharArray()) {
      if (ignoreList.get(character.toString()) != null) {
        continue;
      }

      count++;
    }
    return count;
  }

  public static void LabProgram() {
    Scanner scnr = new Scanner(System.in);
    String userText;
    // Add more variables as needed

    userText = scnr.nextLine(); // Gets entire line, including spaces.

    HashMap<String, String> ignoreList = new HashMap<String, String>();
    ignoreList.put(" ", " ");
    ignoreList.put(".", ".");
    ignoreList.put(",", ",");
    ignoreList.put("!", "!");

    Integer count = CountCharacters(ignoreList, userText);
    System.out.println(count);

  }

  public static void main(String[] args) {
    // DrawHalfArrow();
    LabProgram();
  }
}
