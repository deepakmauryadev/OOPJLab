import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called: length = " + length + ", width = " + width);
    }
}

class Box extends Plate {
    double height;

    Box(double length, double width, double height) {
        super(length, width); // Call the constructor of the parent class (Plate)
        this.height = height;
        System.out.println("Box constructor called: height = " + height);
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height); // Call the constructor of the parent class (Box)
        this.thickness = thickness;
        System.out.println("WoodBox constructor called: thickness = " + thickness);
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter thickness: ");
        double thickness = scanner.nextDouble();

        WoodBox woodBox = new WoodBox(length, width, height, thickness); 

        scanner.close();
    }
}
