import java.util.Scanner;

public class StringsAdvancedLive {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // System.out.println("I need 2 numbers please: ");
    // System.out.print("Enter 1: ");
    // double a = sc.nextDouble();
    // System.out.print("Enter 2: ");
    // double b = sc.nextDouble();
    //
    // System.out.println("Added: " + (a+b));
    // System.out.println("Subtracted: " + (a-b));
    // System.out.println("Multiply: " + (a*b));
    // System.out.println("Divided: " + (a/b));
    // System.out.println("Modulus: " + (a%b));
    // System.out.println("Power: " + Math.pow(a, b));
    // System.out.println("Square Root of Input 1: " + Math.sqrt(a));
    // System.out.println("Square Root of Input 2: " + Math.sqrt(b));

    // String first_name = "Michael";
    // System.out.println("Enter your name");
    // String other_name = sc.next();

    // this is the wrong way
    // if(first_name == other_name) {
    //   System.out.println("This will print");
    // } else {
    //   System.out.println("It must have not worked");
    // }

    // if(first_name.equals(other_name)) {
    //   System.out.println("This will print");
    // } else {
    //   System.out.println("It must have not worked");
    // }

    // System.out.println("Do you want to go up or down? (up/down)");
    // String answer = sc.next();
    // answer = answer.toLowerCase();
    //
    // if(answer.equals("up") || answer.equals("north")) {
    //   System.out.println("Go up!");
    // } else if(answer.equals("down")) {
    //   System.out.println("Inverse up");
    // } else {
    //   System.out.println("Mr. Ferra doesn't really know code then...");
    // }

    System.out.println("Simply... tell me yes or no?");
    String answer = sc.next();
    answer = answer.toLowerCase();

    if(answer.equals("no") || answer.equals("know") || answer.equals("negative") || answer.equals("nope")) {
      System.out.println("THEY SAID NO......");
    } else if(answer.equals("yes") || answer.equals("yeah") || answer.equals("si") || answer.equals("yesss")) {
      System.out.println("THEY SAID YESSSSS.....");
    } else if(answer.equals("maybe")) {
      System.out.println("Get your life together man!");
    } else {
      System.out.println("Mr. Ferra doesn't really know code then...");
    }



  }
}
