class Lab02Q1 {
  public static void main(String[] args) {
    int largest = Integer.parseInt(args[0]);

    for (int i=1; i<args.length; i++) {
      int x = Integer.parseInt(args[i]);
      if (largest < x) largest = x;
    }

    System.out.println("Largest: " + largest);
  }
}