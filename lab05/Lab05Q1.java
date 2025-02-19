import java.util.Scanner;

abstract class Student {
  int rollNo;
  int regNo;

  void getInput() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Roll no: ");
    int rollNo = sc.nextInt();
    this.rollNo = rollNo;

    System.out.print("Registration no: ");
    int regNo = sc.nextInt();
    this.regNo = regNo;

    sc.close();
  };

  abstract void course();
}

class Kiitian extends Student {
  void course() {
    System.out.println("Course - B.Tech. (Computer Science & Engg)");
  }
}

public class Lab05Q1 {
  public static void main(String[] args) {
    Kiitian kiitian = new Kiitian();
    kiitian.getInput();

    System.out.println("Roll no - " + kiitian.rollNo);
    System.out.println("Registration no - " + kiitian.regNo);

    kiitian.course();
  }
}
