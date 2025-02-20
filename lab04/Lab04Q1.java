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
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 2D sheet dimensions"); 

    System.out.print("Length: ");
    int length1 = sc.nextInt();

    System.out.print("Width: ");
    int width1 = sc.nextInt();

    Sheet sheet = new Sheet(40, length1, width1);
    System.out.println("Cost: " + sheet.calculateCost());


    System.out.println("Enter 3D box dimensions"); 

    System.out.print("Length: ");
    int length = sc.nextInt();

    System.out.print("Width: ");
    int width = sc.nextInt();

    System.out.print("Height: ");
    int height = sc.nextInt();

    Box box = new Box(60, length, width, height);
    System.out.println("Cost: " + box.calculateCost());

    sc.close();
  }
}
