public class Lab02Q5 {
  public static void main(String[] args) {
    int[] arr = new int[100];
    for (int i=0; i<arr.length; i++) arr[i] = 0;

    for (int i=0; i<args.length; i++) {
      int x = Integer.parseInt(args[i]);
      ++(arr[x]);
    }

    for (int i=0; i<arr.length; i++) {
      if (arr[i] > 0) {
        System.out.println("Occurrance of " + i + ": " + arr[i]);
      }
    }
  }
}
