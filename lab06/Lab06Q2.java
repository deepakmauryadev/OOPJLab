public class Lab06Q2 {
  public static void main(String[] args) {
    int a = 10;
    int b = 0;

    try {
      int c = a/b;
      System.out.println("c = " + c);

    } catch (ArithmeticException e) {
      System.err.println("Exception in thread 'main' " + e);
    } finally {
      System.out.println("Value of a = " + a);
      System.out.println("Value of b = " + b);
    }
  }
}
