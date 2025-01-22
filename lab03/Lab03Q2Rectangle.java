package lab03;

public class Lab03Q2Rectangle {
  public int length;
  public int breadth;
  public int area;
  public int perimeter;

  public void read() {
    System.out.println("Length: " + length);
    System.out.println("Breadth: " + breadth);
  }

  public void calculate() {
    area = length * breadth;
    perimeter = 2 * (length + breadth);
  }

  public void display() {
    System.out.println("Area: " + area);
    System.out.println("Perimeter: " + perimeter);
  }
}
