import java.util.Scanner;
public class Looping {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the highest number to check for even/odd: ");
    int highest = sc.nextInt();
    for(int i = 0; i < highest; i++) {
      if(i % 2 == 0) {
        System.out.println("Number " + i + " is even!");
      } else {
        System.out.println("Number " + i + " is odd!");
      }
    }
    System.out.print("Enter the highest number to check for even/odd/prime: ");
    int highest2 = sc.nextInt();
    for(int i = 1; i < highest; i++) {
      if(i % 2 == 0) {
        System.out.println("Number " + i + " is even!");
      } else {
        System.out.println("Number " + i + " is odd!");
      }
      int count = 0;
      for(int b = 1; b <= i; b++) {
        if(i % b == 0) {
          count++;
        }
      }
      if(count == 2 || count == 1) {
        System.out.println("And it is a Prime!");
      }
    }
  }
}
