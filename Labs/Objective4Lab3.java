import java.util.Scanner;
import java.time.YearMonth;

public class Objective4Lab3 {
  public static void main (String[] args) {
    int birthYear, age;

    birthYear = 0;
    int currentYear = YearMonth.now().getYear();

    Scanner input = new Scanner(System.in);

    System.out.println("How old are you? ");
    age = input.nextInt();

    birthYear = currentYear - age;

    System.out.println("You were born in " + birthYear);
  }
}
