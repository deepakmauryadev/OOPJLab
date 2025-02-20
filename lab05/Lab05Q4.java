import java.util.Scanner;

interface Employee {
  void getDetails();
}

interface Manager extends Employee {
  void getDeptDetails();
}

class Head implements Manager {
  private int empId;
  private String empName;
  private int deptId;
  private String deptName;

  public Head(int empId, String empName, int deptId, String deptName) {
    this.empId = empId;
    this.empName = empName;
    this.deptId = deptId;
    this.deptName = deptName;
  }

  public void getDetails() {
    System.out.println("Employee id - " + empId);
    System.out.println("Employee name - " + empName);
  }

  public void getDeptDetails() {
    System.out.println("Department id - " + deptId);
    System.out.println("Department name - " + deptName);
  }
}

public class Lab05Q4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter employee id: ");
    int empId = sc.nextInt();
    sc.nextLine();
    
    System.out.print("Enter employee name: ");
    String empName = sc.nextLine();
    
    System.out.print("Enter department id: ");
    int deptId = sc.nextInt();
    sc.nextLine();
    
    System.out.print("Enter department name: ");
    String deptName = sc.nextLine();
    
    Head head = new Head(empId, empName, deptId, deptName);
    
    head.getDetails();
    head.getDeptDetails();
    
    sc.close();
  }
}
