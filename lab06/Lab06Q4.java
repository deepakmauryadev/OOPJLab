import java.util.Scanner;

class TimeException extends Exception {
  TimeException(String message) {
    super(message);
  }
}

class HrsException extends TimeException {
  HrsException(String message) {
    super(message);
  }
}

class MinException extends TimeException {
  MinException(String message) {
    super(message);
  }
}

class SecException extends TimeException {
  SecException(String message) {
    super(message);
  }
}

class Time {
  int hr;
  int min;
  int sec;

  Time(int hr, int min, int sec) throws HrsException, MinException, SecException {
    if (hr > 24 || hr < 0) throw new HrsException("Invaid value for hour!");
    else if (min > 60 || hr < 0) throw new MinException("Invaid value for minute!");
    else if (sec > 60 || sec < 0) throw new SecException("Invaid value for second!");

    this.hr = hr;
    this.min = min;
    this.sec = sec;

    System.out.println("Time -> " + hr + ":" + min + ":" + sec);
  }
}

public class Lab06Q4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      System.out.print("Enter hour: ");
      int hr = sc.nextInt();
      System.out.print("Enter minute: ");
      int min = sc.nextInt();
      System.out.print("Enter second: ");
      int sec = sc.nextInt();

      Time time = new Time(hr, min, sec);
    } catch (TimeException e) {
      System.err.println("Caught the exception " + e);
    }

    sc.close();
  }
}
