package lab01;
import java.util.Scanner;

public class Lab01Q5 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter name: ");
    String name = scn.nextLine();
    System.out.print("Enter surname: ");
    String surname = scn.nextLine();

    System.out.print(name + " " + surname);

    scn.close();
  }
}
