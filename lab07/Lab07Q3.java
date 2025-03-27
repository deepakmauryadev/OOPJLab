import java.io.*;
import java.util.Scanner;

public class Lab07Q3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the source file name: ");
    String source = sc.nextLine();

    System.out.print("Enter the destination file name: ");
    String dest = sc.nextLine();

    try (FileReader fr = new FileReader(source); FileWriter fw = new FileWriter(dest)) {
      int ch;
      while ((ch = fr.read()) != -1) fw.write(ch);
      System.out.println("File Copied!");
    } catch (IOException e) {
      System.err.println(e);
    } 

    sc.close();
  }
}
