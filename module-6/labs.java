
import java.util.Scanner;

public class labs {
  public static void parsingNames() {
    Scanner scanner = new Scanner(System.in);

    String input;

    while (true) {
      System.out.println("Enter input string: ");
      input = scanner.nextLine();
      if (input.equals("q")) {
        break;
      }

      if (!input.contains(",")) {
        System.out.println("Error: No comma in string");
        continue;
      }

      String[] stringArr = input.split(",");
      if (stringArr.length > 2) {
        System.out.println(input.length());
        continue;
      }

      System.out.println("First word: " + stringArr[0].strip());
      System.out.println("Second word: " + stringArr[1].strip());
      System.out.println("\n");
    }
  }

  public static void parsingDates() {

  }

  public static void main(String[] args) {
    // parsingNames();
    parsingDates();
  }
}
