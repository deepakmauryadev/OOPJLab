package lab01;
public class Lab01Q2 {
    public static void main(String[] args) throws Exception {
      int marks = 73;
      
      if (marks >= 90 && marks <= 100) {
        System.out.println("O");
      } else if (marks >= 80 && marks < 90) {
        System.out.println("E");
      } else if (marks >= 70 && marks < 80) {
        System.out.println("A");
      } else if (marks >= 60 && marks < 70) {
        System.out.println("B");
      } else if (marks >= 50 && marks < 60) {
        System.out.println("C");
      } else if (marks >= 40 && marks < 50) {
        System.out.println("D");
      } else {
        System.out.println("F");
      }
    }
}
