
import java.sql.Date;
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

  public static int getMonthAsInt(String monthString) {
    int monthInt;

    // Java switch/case statement
    switch (monthString) {
      case "January":
        monthInt = 1;
        break;
      case "February":
        monthInt = 2;
        break;
      case "March":
        monthInt = 3;
        break;
      case "April":
        monthInt = 4;
        break;
      case "May":
        monthInt = 5;
        break;
      case "June":
        monthInt = 6;
        break;
      case "July":
        monthInt = 7;
        break;
      case "August":
        monthInt = 8;
        break;
      case "September":
        monthInt = 9;
        break;
      case "October":
        monthInt = 10;
        break;
      case "November":
        monthInt = 11;
        break;
      case "December":
        monthInt = 12;
        break;
      default:
        monthInt = 0;
    }

    return monthInt;
  }

  public static void dateFormatCheck(String dateString) {
    // dateString.substring(beginIndex)
  }

  public static void parsingDates() {
    Scanner scnr = new Scanner(System.in);

    // TODO: Read dates from input, parse the dates to find the ones
    // in the correct format, and output in m/d/yyyy format
    String test = "March 1, 1990";
    String woop = test.substring(1);
    System.out.println(woop);
  }

  public static void main(String[] args) {
    // parsingNames();
    parsingDates();
  }
}
