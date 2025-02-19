class CheckArgument extends Exception {
  CheckArgument(String message) {
    super(message);
  }
}

class Argument {
  static void Validate(String[] args, int n) throws CheckArgument {
    if (args.length < n) throw new CheckArgument("Argument is less than " + n + "!");
  }
}

public class Lab06Q5 {
  public static void main(String[] args) {
    int n = 4;
    int output = 0;

    try {
      Argument.Validate(args, n);

      for (int i=0; i<n; i++) {
        int num = Integer.parseInt(args[i]);
        output += num * num;
      }

      System.out.println(output);
    } catch (CheckArgument e) {
      System.err.println("Exception occurred - " + e);
    }
  }
}
