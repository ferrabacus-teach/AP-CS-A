public class ArithOperators {
  public static void main(String[] args) {

    /* Using Arithmetic Operators with variables.
    **
    */
    int x = 5;
    int y = x + 7;
    x = y * 3;
    int z = x - y;

    /* Using Arithmetic Operators with Printing.
    **
    */
    int a = 3;
    int b = 5;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(5 * 3);
    System.out.println(6 / 2);

    /* Integer Division with Modulus
    **
    */
    int m = 5;
    int n = 2;
    double o = 5.0;
    double p = 2.0;
    System.out.println(m / n);
    System.out.println(o / p);
    System.out.println(m % n);

    /* Exponents & Roots
    *
    */ 
    double r = 4.0;
    double s = 2.0;
    double exponent = Math.pow(r, s);
    double root = Math.sqrt(r);
    System.out.println(Math.sqrt(r));
    double root2 = Math.sqrt(s);
    System.out.println(Math.sqrt(s));

  }
}
