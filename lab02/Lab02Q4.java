public class Lab02Q4 {
  static int noOfCalls = 0;

  Lab02Q4() {
    noOfCalls++;
  }

  public static void main(String[] args) {
    Lab02Q4 lab1 = new Lab02Q4();
    Lab02Q4 lab2 = new Lab02Q4();
    Lab02Q4 lab3 = new Lab02Q4();

    System.out.println(noOfCalls);
  }
}