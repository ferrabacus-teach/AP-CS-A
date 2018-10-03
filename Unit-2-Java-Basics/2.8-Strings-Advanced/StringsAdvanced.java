import java.util.Scanner;

public class StringsAdvanced {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Comparing Strings

    String first_name = "Michael";

    if(first_name == "Michael") {
      System.out.println("Does this print? ");
    }


    if(first_name.equals("Michael")) {
      System.out.println(".equals() works and == does not");
    }

    String name = "Michael";
    if(first_name.equals(name)) {
      System.out.println("A String variable can be compared.");
    }

    // Upper and Lower Case

    System.out.println("Is your name, Michael? (y/n)");
    String answer = scan.next();

    if(answer.equals("y")) {
      System.out.println("Sweet, me too!");
    } else {
      System.out.println("Guess you don't have an awesome name");
    }

    System.out.println("Lets try it again, is your name Michael? (y/n)");
    String response = scan.next();
    response = response.toLowerCase();

    if(response.equals("y")) {
      System.out.println("Sweet, me too!");
    } else {
      System.out.println("Guess you don't have an awesome name");
    }


  }
}
