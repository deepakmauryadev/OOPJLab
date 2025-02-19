abstract class InternalMarks {
  abstract void attendenceCheck();
}

class Student extends InternalMarks {
  int roll;
  String name;
  int attendence;
  int internalMarks;

  Student(int roll, String name, int attendence, int internalMarks) {
    this.roll = roll;
    this.name = name;
    this.attendence = attendence;
    this.internalMarks = internalMarks;
  }

  void attendenceCheck() {
    System.out.println(name + "'s attendance is " + attendence + "%");
  }

  void improveInternalMarks(int marks) {
    if (attendence > 75) {
      internalMarks = marks;
      System.out.println(name + "'s internal marks updated to " + internalMarks);
    } else System.out.println("Insufficient attendence for improvement!");
  }
}

public class Assignment01 {
  public static void main(String[] args) {
    Student s1 = new Student(23053044, "Deepak", 85, 42);
    s1.attendenceCheck();
    s1.improveInternalMarks(48);

    Student s2 = new Student(23050001, "John Doe", 56, 38);
    s2.attendenceCheck();
    s2.improveInternalMarks(45);
  } 
}
