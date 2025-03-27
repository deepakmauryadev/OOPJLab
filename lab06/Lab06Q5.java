class CheckArgumentException extends Exception {
  CheckArgumentException(String message) {
    super(message);
  }
}

public class Lab06Q5 {
  static void validateArgument(String[] args, int n) throws CheckArgumentException {
    if (args.length < n) throw new CheckArgumentException("Argument is less than " + n + "!");
  }

  public static void main(String[] args) {
    int n = 4;
    int output = 0;

    try {
      validateArgument(args, n);

      for (int i=0; i<n; i++) {
        int num = Integer.parseInt(args[i]);
        output += num * num;
      }

      System.out.println(output);
    } catch (CheckArgumentException e) {
      System.err.println("Exception occurred - " + e);
    }
  }
}
