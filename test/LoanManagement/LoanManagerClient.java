import java.util.ArrayList;
import java.util.Scanner;

public class LoanManagerClient {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LoanManager.createCustomer(new Customer(101, "Deepak", 20, 3000000));
    LoanManager.createCustomer(new Customer(102, "Paranjay", 22, 2800000));
    LoanManager.createCustomer(new Customer(103, "Nitish", 19, 2200000));
    LoanManager.createCustomer(new Customer(104, "Ridhum", 19, 3400000));
    LoanManager.createLoan(new Loan(1, "Car Loan", 20, 2500000));
    LoanManager.createLoan(new Loan(2, "Home Loan", 22, 3000000));
    LoanManager.createLoan(new Loan(3, "Personal Loan", 18, 2000000));

    while (true) {
      System.out.println("1. Apply for a new loan.");
      System.out.println("2. View all loan status.");
      System.out.println("3. Exit.");
      System.out.print("Enter choice: ");
      int choice = sc.nextInt();

      switch (choice) {
        case 1:
          System.out.println("ID\tName");
          ArrayList<Customer> customers = LoanManager.customers;
          for (int i=0; i<customers.size(); i++) {
            System.out.printf("%d\t%s\n", customers.get(i).customerId, customers.get(i).name);
          }

          System.out.print("Enter Customer ID: ");
          int custId = sc.nextInt();
          Customer cust = LoanManager.getCustomer(custId);

          System.out.println("ID\tType");
          ArrayList<Loan> loans = LoanManager.loans;
          for (int i=0; i<loans.size(); i++) {
            System.out.printf("%d\t%s\n", loans.get(i).loanTypeId, loans.get(i).loanName);
          }

          System.out.print("Enter Loan Type ID: ");
          int loanTypeId = sc.nextInt();
          Loan loan = LoanManager.getLoanTypeDetail(loanTypeId);

          System.out.print("Enter Loan Amount: ");
          double amount = sc.nextDouble();

          int applicationId = LoanManager.generateApplicationId();
          LoanApplication application = new LoanApplication(applicationId, cust, loan, amount);
          String result = LoanManager.applyForLoan(application);
          System.out.println(result);

          break;

        case 2:
          System.out.println("All Loan Applications\n");
          System.out.println("ID\tCustomer\tStatus");
          ArrayList<LoanApplication> applications = LoanManager.getApplications();
          
          for (int i=0; i<applications.size(); i++) {
            System.out.printf("%d\t%s\t%s\n", applications.get(i).applicationId, applications.get(i).customer.name, applications.get(i).status);
          }
          break;
        
        case 3:
          sc.close();
          return;
      }

      System.out.println("");
    }

  }
}
