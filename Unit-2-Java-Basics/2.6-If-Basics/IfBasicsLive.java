import java.util.Scanner;

public class IfBasicsLive {
  public static void main(String[] args) {

    boolean triggered = true;
    if(triggered) {
      System.out.println("Watch out! ");
    }

    int higgins = 2;
    int queen = 5;

    if(higgins == queen) {
      System.out.println("This will print?");
    }
    if(higgins != queen) {
      System.out.println("Does not equal");
    }

    if(higgins <= queen) {
      System.out.println("Less than or equal to");
    }

    int thanos = 1000000;
    int avengers = 0;

    if(avengers < thanos) {
      System.out.println("Avengers are awesome!");
    } else {
      System.out.println("Thanos Smash");
    }

    if(Math.pow(6, 2) > 30) {
      System.out.println("Greater than 30");
    } else {
      System.out.println("It is smaller than 30.");
    }

    Scanner logan = new Scanner(System.in);

    System.out.print("Enter a decimal, please: ");
    double sherida = logan.nextDouble();

    if(sherida <= 9000) {
      System.out.println("Its less than 9000");
    } else {
      System.out.println("Its over 9000!!!"); 
    }
  }
}
