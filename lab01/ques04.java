package lab01;
import java.util.Scanner;

public class ques04 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    System.out.print("Enter number: ");
    int num = scn.nextInt();

    int temp = num;
    int rev = 0;

    while (temp != 0) {
      rev = (rev * 10) + (temp % 10);
      temp = temp / 10;
    }

    if (rev == num) {
      System.out.println("It's a palindrome!");
    } else {
      System.out.println("It's not a palindrome!");
    }

    scn.close();
  }
}
