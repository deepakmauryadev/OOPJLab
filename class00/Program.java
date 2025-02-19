public class Program {
  public static void main(String[] args) {
    int[] arr = {1,2,3};
    int[][] arr2;

    Object obj = arr;

    arr2 = new int[8][8];
    arr2[0] = (int[])obj;
  }
}
