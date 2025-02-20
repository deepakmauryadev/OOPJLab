import java.util.Scanner;

class Plate {
  double length, width;

  Plate(double length, double width) {
    this.length = length;
    this.width = width;
    System.out.println("Plate constructor: length = " + length + ", width = " + width);
  }
}

class Box extends Plate {
  double height;

  Box(double length, double width, double height) {
    super(length, width);
    this.height = height;
    System.out.println("Box constructor: height = " + height);
  }
}

class WoodBox extends Box {
  double thickness;

  WoodBox(double length, double width, double height, double thickness) {
    super(length, width, height);
    this.thickness = thickness;
    System.out.println("WoodBox constructor: thickness = " + thickness);
  }
}

public class Lab04Q2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter length: ");
    double length = sc.nextDouble();
    System.out.print("Enter width: ");
    double width = sc.nextDouble();
    System.out.print("Enter height: ");
    double height = sc.nextDouble();
    System.out.print("Enter thickness: ");
    double thickness = sc.nextDouble();

    new WoodBox(length, width, height, thickness); 

    sc.close();
  }
}
