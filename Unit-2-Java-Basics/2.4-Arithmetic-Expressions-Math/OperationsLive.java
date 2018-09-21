import java.util.Scanner;

public class OperationsLive {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int a = 6 * 7;
    System.out.println(a);

    System.out.println("Hi: " + a);
    System.out.println("Hi: " + "12");

    double b = 20 / 20;
    double c = 20 / 1.2345;

    System.out.println(b);
    System.out.println(c);

    System.out.println("This is 5 / 2: " + 5.0 / 2.0);
    System.out.println("This is 5 mod 2: " + 5 % 2);

    double square_root = Math.sqrt(65);
    System.out.println(square_root);
    System.out.println(Math.pow(900,2));

    System.out.println("Cubed Root: " + Math.pow(27,(1.0/3.0)));
    System.out.println("Cubed Root: " + Math.pow(33, (1.0/4.0)));

    System.out.println((3.0/ 5.0) + (2*8) - 7); 
  }
}
