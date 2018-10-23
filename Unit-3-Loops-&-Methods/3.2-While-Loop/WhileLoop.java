import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    /*
    while(conditionIsTrue) {
      // Do this stuff while condition is true
      // Loop stops when the condition becomes false.
    }
    */

    // int x = 0;
    // while(x < 10) {
    //   System.out.println(x);
    //   x++;
    // }
    //
    // for(int i = 0; i < 10; i++) {
    //   System.out.println(i);
    // }
    //
    Scanner scan = new Scanner(System.in);
    //
    // String answer = "";
    // int count = 0;
    // while(!answer.equals("exit")) {
    //   System.out.print(count + ": Exit or Keep Going!: ");
    //   answer = scan.next();
    //   count++;
    // }
    //
    // while(true) {
    //   System.out.print("Do you still feel awesome?: ");
    //   String answer1 = scan.next();
    //   if(answer1.equals("y")) {
    //     System.out.println("Good!");
    //   } else {
    //     System.out.println("Well I guess my job is done");
    //     break;
    //   }
    // }

    while(true) {
      System.out.print("Do you still feel awesome?: ");
      String answer2 = scan.next();
      if(answer2.equals("y")) {
        System.out.println("Good!");
      } else if(answer2.equals("n")) {
        break;
      } else {
        System.out.println("Well I guess that wasn't really an option");
        System.out.println("Try again, my friend");
        continue;
      }
    }

    System.out.println("Counting a, b, c. ");
    int a = 0, b = 0, c = 0;
    String new_answer = "";
    while(true){
      System.out.println("Enter a, b, c, or exit");
      new_answer = scan.next();

      if(new_answer.equals("a")) {
        a++;
      } else if(new_answer.equals("b")) {
        b++;
      } else if(new_answer.equals("c")) {
        c++;
      } else {
        break;
      }
    }

  }
}
