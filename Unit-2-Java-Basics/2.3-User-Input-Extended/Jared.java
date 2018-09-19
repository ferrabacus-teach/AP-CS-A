import java.util.Scanner;

public class Jared {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Give me a number: ");
    int int1 = input.nextInt();
    String overflow = input.nextLine();
    System.out.println(int1);

    System.out.print("Give me a sentence: ");
    String sentence = input.nextLine();
    System.out.println(sentence);
  }
}
