public class Variables {
  public static void main(String[] args) {

    // How to declare a variable
    // [type] [name] ;
    int x;
    double y;
    boolean logic;
    char character;

    // Declare and initialize a variable
    // Using the assignment operator.
    int integer = 0;
    double decimal;
    decimal = 1.0;
    boolean logical = true;

    /* Naming Procedures
    1. Use a meaningful name
    2. Cannot start with a number -> 8num will not work
    3. Cannot use a java keyword.
    4. No spaces in names
    5. Use camelCase if more than one word is needed.
    */

    /* Multiple Declarations & Initializations
    [type] [name], [name], [name];
    [type] [name] = value, [name] = value;
    */
    int alpha, beta, charlie;
    double delta = 3.65, echo = 10.987, foxtrot = 10.0;

    /* Printing Variables
    System.out.println( name );
    No Quotes Necessary
    */

    System.out.println(integer);
    System.out.println(decimal);
    System.out.println(logical);
    System.out.println("My number is: " + delta);
    System.out.println("My other number is: " + echo + " and " + foxtrot);

  }
}
