import java.util.Scanner;

class Plastic {
  int costPerUnit;

  Plastic(int costPerUnit) {
    this.costPerUnit = costPerUnit;
  }
}

class Sheet extends Plastic {
  int length, width;

  Sheet(int costPerUnit, int length, int width) {
    super(costPerUnit);
    this.length = length;
    this.width = width;
  }

  double calculateCost() {
    int area = length * width;
    return area * costPerUnit;
  }
}

class Box extends Sheet {
  int height;

  Box(int costPerUnit, int length, int width, int height) {
    super(costPerUnit, length, width);
    this.height = height;
  }

  double calculateCost() {
    int volume = length * width * height;
    return volume * costPerUnit;
  }
}

public class Lab04Q1 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter 2D sheet dimensions"); 

    System.out.print("Length: ");
    int length1 = scn.nextInt();

    System.out.print("Width: ");
    int width1 = scn.nextInt();

    Sheet sheet = new Sheet(40, length1, width1);
    System.out.println("Cost: " + sheet.calculateCost());


    System.out.println("Enter 3D box dimensions"); 

    System.out.print("Length: ");
    int length = scn.nextInt();

    System.out.print("Width: ");
    int width = scn.nextInt();

    System.out.print("Height: ");
    int height = scn.nextInt();

    Box box = new Box(60, length, width, height);
    System.out.println("Cost: " + box.calculateCost());
  }
}
