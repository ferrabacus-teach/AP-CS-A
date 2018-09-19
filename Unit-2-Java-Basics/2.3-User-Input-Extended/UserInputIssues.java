import java.util.Scanner;

public class UserInputIssues {
  public static void main(String[] args) {

    /* nextLine() issues.
    * This method will pull from the end of the previous input
    * To counter this: either use .nextLine() first!
    * or
    * use .nextLine() to clean up the last input and then-
    * use it again to get the actual input.
    */

    Scanner sc = new Scanner(System.in);

    System.out.print("I'd like an integer please: ");
    int number = sc.nextInt();
    String overflow = sc.nextLine(); // This line cleans up the previous input.

    System.out.print("I'd like a sentence please: ");
    String phrase = sc.nextLine();

    /* Other Data Type Examples
    *
    */

    // get a word
    System.out.print("word: ");
    String word = sc.next();

    // get a double
    System.out.print("decimal: ");
    Double decimal = sc.nextDouble();

    // get a int
    System.out.print("integer: ");
    int integer = sc.nextInt();

    // get a sentence
    System.out.print("sentence: ");
    String cleanup = sc.nextLine(); // cleans previous input
    String sentence = sc.nextLine();
  }
}
