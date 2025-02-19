interface Motor {
  int capacity = 100;
  void run();
  void consume();
}

class WashingMechine implements Motor {
  int capacity;

  WashingMechine(int capacity) {
    this.capacity = capacity;
  }

  public void run() {
    System.out.println("Washing mechine is runnig!");
  }

  public void consume() {
    System.out.println("Washing mechine is consuming power!");
  }
}

public class Lab05Q2 {

  public static void main(String[] args) {
    WashingMechine wm = new WashingMechine(100);

    System.out.println("Capacity of the motor is " + wm.capacity);

    wm.run();
    wm.consume();
  }
}
