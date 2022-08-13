
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Files;

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
      case "january":
        monthInt = 1;
        break;
      case "february":
        monthInt = 2;
        break;
      case "march":
        monthInt = 3;
        break;
      case "april":
        monthInt = 4;
        break;
      case "may":
        monthInt = 5;
        break;
      case "june":
        monthInt = 6;
        break;
      case "july":
        monthInt = 7;
        break;
      case "august":
        monthInt = 8;
        break;
      case "september":
        monthInt = 9;
        break;
      case "october":
        monthInt = 10;
        break;
      case "november":
        monthInt = 11;
        break;
      case "december":
        monthInt = 12;
        break;
      default:
        monthInt = 0;
    }

    return monthInt;
  }

  public static void parsingDates() {
    Scanner scnr = new Scanner(System.in);
    String dateString = scnr.nextLine();
    String[] monthDateYear;
    while (!dateString.contains("-1")) {
      if (dateString.contains(",")) {
        monthDateYear = dateString.split(",");
        String[] monthDate = monthDateYear[0].split(" ");
        System.out.printf("%s/%s/%s\n", getMonthAsInt(monthDate[0].toLowerCase()), monthDate[1],
            monthDateYear[1].strip());
      }
      dateString = scnr.nextLine();
    }
  }

  public static void fileNameChange() {
    Scanner scnr = new Scanner(System.in);
    String userInput = scnr.nextLine();

    File test = new File(".");
    String[] files = test.list();
    String scannedFile = "";

    for (String file : files) {
      if (file.contains(userInput)) {
        scannedFile = file;
      }
    }

    try {
      File file = new File(scannedFile);
      Scanner fileReader = new Scanner(file);

      while (fileReader.hasNextLine()) {
        String data = fileReader.nextLine();
        String newData = data.replace("_photo.jpg", "_info.txt");
        System.out.println(newData);
      }

      fileReader.close();
    } catch (FileNotFoundException e) {
    }
  }

  public static void main(String[] args) {
    // parsingNames();
    // parsingDates();
    fileNameChange();
  }
}
