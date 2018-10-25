import java.util.Scanner;

public class Summation {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double sum = 0;

    System.out.println("Enter a number: ");
    double number = scan.nextDouble();

    //sum = sum + number;
    sum += number;
    System.out.println(sum);

    System.out.println("Enter a number: ");
    double number2 = scan.nextDouble();

    sum = sum + number2;
    System.out.println(sum);

    // Code to run a jar file
    // cd Desktop
    // java -jar Averager.jar

  }
}
