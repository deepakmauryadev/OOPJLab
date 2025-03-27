import java.util.Scanner;

public class Lab06Q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int size = 4;
    int[] arr = new int[size];

    System.out.println("Enter elements of array.");
    for (int i=0; i<size; i++) {
      System.out.print(i + ": ");
      arr[i] = sc.nextInt();
    }

    try {
      arr[10] = 98;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.err.println("Exception in thread 'main' " + e);
    }

    sc.close();
  }
}
