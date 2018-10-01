import java.util.Scanner;

public class IfAdvancedLive{
  public static void main(String[] args) {

    int jared = 66;
    if(jared > 50){
      System.out.println("F");
    }
    else if(jared > 60){
      System.out.println("D");
    }
    else if(jared > 70){
      System.out.println("C");
    }

    Scanner sc = new Scanner(System.in);
    System.out.println("Hey User, yeah you, give me a number: ");
    int numb = sc.nextInt();

    if(numb > 50) {
      System.out.println("Your number is greater than 50!");
    } else if(numb < 50){
      System.out.println("Your number is less than 50!");
    } else if(numb == 50) {
      System.out.println("Your number must be 50!");
    }

    System.out.println("I need another number");
    double higgins = sc.nextDouble();

    if(higgins > 666 && higgins < 1000) {
      System.out.println("Its between 666 and 1000");
    } else if(higgins > 1000 || higgins < 666) {
      System.out.println("Its below 666 or 1000");
    }

    boolean fridgeRunning = false;

    if(!fridgeRunning) {
      System.out.println("Then it must be running");
    }
  }
}
