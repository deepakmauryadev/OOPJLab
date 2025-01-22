package lab03;

import java.util.Scanner;

public class Lab03Q3Student {
  public int rollno;
  public String name;
  public double cgpa;

  Lab03Q3Student(int rollno, String name, double cgpa) {
    this.rollno = rollno;
    this.name = name;
    this.cgpa = cgpa;
  }
  
  public static void main() {
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter number of student: ");
    int n = scn.nextInt();

    Lab03Q3Student[] students = new Lab03Q3Student[n];

    for (int i=0; i<n; i++) {
      System.out.println("Enter details for student " + i);
      System.out.print("Enter roll number: ");
      int rollno = scn.nextInt();
      System.out.print("Enter name: ");
      String name = scn.next();
      System.out.print("Enter cgpa: ");
      double cgpa = scn.nextDouble();

      students[i] = new Lab03Q3Student(rollno, name, cgpa);
    }

    Lab03Q3Student lowestCgpaStudent = students[0];
    for (int i=0; i<n; i++) {
      System.out.println("Details of student " + i);
      System.out.println("Roll number: " + students[i].rollno);
      System.out.println("Name: " + students[i].name);
      System.out.println("CGPA : " + students[i].cgpa);

      if (students[i].cgpa < lowestCgpaStudent.cgpa) lowestCgpaStudent = students[i];
    }

    System.out.println("Lowest CGPA student");
    System.out.println("Roll number: " + lowestCgpaStudent.rollno);
    System.out.println("Name: " + lowestCgpaStudent.name);
    System.out.println("CGPA : " + lowestCgpaStudent.cgpa);

    scn.close();
  }
}
