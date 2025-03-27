import java.util.Scanner;

public class Lab07Q1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter first string: ");
    String str1 = sc.nextLine();
    System.out.print("Enter second string: ");
    String str2 = sc.nextLine();
    StringBuilder sb = new StringBuilder(str1);

    System.out.println("Uppercase: " + str1.toUpperCase());
    System.out.println("Lowercase: " + str1.toLowerCase());
    System.out.println("Reverse: " + sb.reverse());
    System.out.println("Compare: " + (str1 == str2));
    String ns = "";
    ns += str1;
    ns += str2;
    System.out.println("Combined String: " + ns);

    System.out.print("Enter char to check: ");
    char ch = sc.nextLine().charAt(0);

    System.out.println("Position: " + str1.indexOf(ch));

    System.out.println("Palindrome: " + (sb == sb.reverse()));

    sc.close();
  }
}
