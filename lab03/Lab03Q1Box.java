package lab03;

import java.util.Scanner;

public class Lab03Q1Box {
  public int length;
  public int width;
  public int height;

  Lab03Q1Box(int length, int width, int height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  public int volume() {
    int vol = length * width * height;
    return vol;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter length: ");
    int length = scn.nextInt();
    System.out.print("Enter width: ");
    int width = scn.nextInt();
    System.out.print("Enter height: ");
    int height = scn.nextInt();

    scn.close();
    Lab03Q1Box demo = new Lab03Q1Box(length, width, height);

    System.out.println("Volume: " + demo.volume());
  }
}
