public class Lab02Q2 {
  public static void main(String[] args) {
    int even = 0;
    int odd = 0;

    for (int i=0; i<args.length; i++) {
      int x = Integer.parseInt(args[i]);
      if (x % 2 == 0) even++;
      else odd++;
    }

    System.out.println("No of even: " + even);
    System.out.println("No of odd: " + odd);
  }
}
