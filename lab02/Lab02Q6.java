public class Lab02Q6 {
  public static void main(String[] args) {
    int[] arr = new int[args.length];

    for (int i=0; i<args.length; i++) arr[i] = Integer.parseInt(args[i]);

    int leftDiag = 0;
    int rightDiag = 0;

    for (int i=0; i<3; i++) {
      for (int j=0; j<3; j++) {
        if (i == j) leftDiag += arr[i*3 + j];
        if ((i+j) == (3-1)) rightDiag += arr[i*3 + j];
      }
    }

    System.out.println("Sum of left diagonal: "+leftDiag);
    System.out.println("Sum of right diagonal: "+rightDiag);
  }
}