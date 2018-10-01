public class IfAdvanced {
  public static void main(String[] args) {

    /*
    if(condition1) {
      // This executes when condition1 is true.
    } else if(condition2) {
      // This executes when condition2 is true.
      // and condition1 is false.
    } else {
      // This executes when both condition 1 & 2
      // are false.
    }
    */

    int a = 0;
    int b = 12;

    // if - else if - else statement
    if(a > b) {
      System.out.println("a > b");
    } else if(b < a) {
      System.out.println("a < b");
    } else {
      System.out.println("a = b");
    }

    // Short Circuit Evaluation
    int grade = 75;
    if(grade > 50) {
      System.out.println("F");
    } else if(grade > 60) {
      System.out.println("D");
    } else if(grade > 70) {
      System.out.println("C");
    } else if(grade > 80) {
      System.out.println("B");
    } else if(grade > 90) {
      System.out.println("A");
    } else {
      System.out.println("E?");
    }

    // Nested if statements
    int number = 50;
    if(number > 0) {
      if(number < 100) {
        System.out.println(" 0 to 100 ");
      } else {
        System.out.println("Below 0 or above 100!");
      }
    } else {
      System.out.println("Below 0");
    }

    //Logical/Boolean Operators
    if(number > 0 && number < 100) {
      System.out.println(" 0 to 100 ");
    } else {
      System.out.println("Below 0 or above 100!");
    }





  }
}
