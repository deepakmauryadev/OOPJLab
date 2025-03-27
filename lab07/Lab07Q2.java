import java.io.*;
import java.util.Scanner;

public class Lab07Q2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter roll number: ");
    int rollNo = sc.nextInt();

    System.out.print("Enter name: ");
    String name = sc.next();

    System.out.print("Enter subject: ");
    String sub = sc.next();

    System.out.print("Enter marks: ");
    double marks = sc.nextDouble();

    System.out.print("Enter the name of the file: ");
    String filename = sc.next();

    try (FileWriter fw = new FileWriter(filename)) {
      fw.write(rollNo + ", " + name + ", " + sub + ", " + marks);
    } catch (IOException e) {
      System.err.println(e);
    }

    try (FileReader fr = new FileReader(filename)) {
      int ch;
      System.out.println("File contents");
      while ((ch = fr.read()) != -1) System.out.print((char) ch);
    } catch (IOException e) {
      System.err.println(e);
    }

    sc.close();
  }
}
