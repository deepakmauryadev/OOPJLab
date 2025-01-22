class Rectangle {
  int lenght;
  int width;

  Rectangle() {
    lenght = 0;
    width = 0;
  }

  Rectangle(int lenght, int width) {
    this.lenght = lenght;
    this.width = width;
  }

  int area() {
    return lenght * width;
  }
}

public class Lab03Q6 {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    System.out.println("Area of rectangle 1: " + r1.area());

    Rectangle r2 = new Rectangle(5, 3);
    System.out.println("Area of rectangle 2: " + r2.area());
  }
}
