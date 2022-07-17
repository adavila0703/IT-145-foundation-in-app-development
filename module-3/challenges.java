public class challenges {

  public static void YearChecker() {
    /*
     * 
     * Write an if-else statement with multiple branches. If givenYear is 2101 or
     * greater, print "Distant future" (without quotes). Else, if givenYear is 2001
     * or greater (2001-2100), print "21st century". Else, if givenYear is 1901 or
     * greater (1901-2000), print "20th century". Else (1900 or earlier), print
     * "Long ago". End with a newline. Remember to use println instead of print to
     * output a newline.
     */
    Scanner scnr = new Scanner(System.in);
    int givenYear;

    givenYear = scnr.nextInt();

  }

  public static void main(String[] args) {
    YearChecker();
  }
}
