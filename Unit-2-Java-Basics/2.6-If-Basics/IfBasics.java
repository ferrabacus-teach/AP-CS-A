public class IfBasics {
  public static void main(String[] args) {

    // Basic setup of if statement
    if(true) {
      System.out.println("This will print if true");
    }

    // Setup with a variable as the condition
    boolean run = true;
    if(run) {
      // code you want to happen if run = true;
    }

    // Using Comparison Operators
    int a = 5;
    int b = 10;
    if(a > b) {
      System.out.println("a > b");
    }
    if(a < b) {
      System.out.println("a < b");
    }

    // Using Comparison Operators with an else
    int c = 10;
    int d = 9;
    if(c > d) {
      System.out.println("c > d");
    } else {
      System.out.println("c <= d");
    }

    // Conditions with Math
    int r = 12;
    if(r * 2 == 24) {
      System.out.println("Then r must be 12");
    }


    // Other Comparison Operator Examples.
    if (c >= d) {
      System.out.println("c >= d");
    }
    if (c <= d) {
      System.out.println("c <= d");
    }
    if (c != d) {
      System.out.println("c does not equal d");
    }
    if (c == d) {
      System.out.println("c equals d");
    }

  }
}
