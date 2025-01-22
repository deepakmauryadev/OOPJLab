class Polygon {
  public static int area(int side) {
    return side * side;
  }

  public static double area(double radius) {
    return 3.14 * radius * radius;
  }

  public static int area(int length, int width) {
    return length * width;
  }
}

public class Lab03Q5 {
  public static void main(String[] args) {
    int side = 10;
    System.out.println("side = " + side);
    System.out.println("area = " + Polygon.area(side));

    double radius = 6.5;
    System.out.println("radius = " + radius);
    System.out.println("area = " + Polygon.area(radius));

    int length = 5;
    int width = 4;
    System.out.println("length = " + length + ", width = " + width);
    System.out.println("area = " + Polygon.area(length, width));
  }
}
