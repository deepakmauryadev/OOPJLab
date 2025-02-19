import java.util.Scanner;

class NegativeNumberException extends Exception {
  NegativeNumberException(String message) {
    super(message);
  }
}

public class Lab06Q3 {
  public static void ProcessInput(int n) throws NegativeNumberException {
    if (n < 0) {
      throw new NegativeNumberException("Negative numbers are not allowed: " + n);
    } else {
      System.out.println("Double value: " + n*2);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number: ");
    int n = sc.nextInt();

    try {
      ProcessInput(n);
    } catch (NegativeNumberException e) {
      System.err.println("Caught the exception " + e);
    }

    sc.close();
  }
}
