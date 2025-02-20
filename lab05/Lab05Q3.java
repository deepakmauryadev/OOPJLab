import java.util.Scanner;

interface Employee {
  double earnings();
  double deductions();
  double bonus();
}

class Manager implements Employee {
  double basicSalary;
  
  Manager(double basicSalary) {
    this.basicSalary = basicSalary;
  }

  public double earnings() {
    double da = 0.80 * basicSalary;
    double hra = 0.15 * basicSalary;
    return basicSalary + da + hra; 
  }

  public double deductions() {
    return 0.12 * basicSalary;
  }

  public double bonus() {
    return 0;
  }
}

class Substaff extends Manager {
  public Substaff(double basicSalary) {
    super(basicSalary);
  }

  public double bonus() {
    return 0.50 * basicSalary;
  }
}

public class Lab05Q3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter basic salary: ");
    double basicSalary = sc.nextDouble();

    Substaff substaff = new Substaff(basicSalary);

    System.out.println("Earnings - " + substaff.earnings());
    System.out.println("Deduction - " + substaff.deductions());
    System.out.println("Bonus - " + substaff.bonus());

    sc.close();
  }
}
