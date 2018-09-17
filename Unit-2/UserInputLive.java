import java.util.Scanner;

public class UserInputLive {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // System.out.println("Hey Bro, I want a number: ");
    // int number = input.nextInt();
    //
    // System.out.println("Your number is: " + number);

    System.out.print("How about a word, now!: ");
    String answer = input.nextLine();
    System.out.println(answer);



  }
}
