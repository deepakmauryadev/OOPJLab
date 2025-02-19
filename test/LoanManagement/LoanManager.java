import java.util.ArrayList;

public class LoanManager {
  static ArrayList<Customer> customers = new ArrayList<Customer>();
  static ArrayList<Loan> loans = new ArrayList<Loan>();
  static ArrayList<LoanApplication> applications = new ArrayList<LoanApplication>();

  public static void createCustomer(Customer customer) {
    customers.add(customer);
  }

  public static void createLoan(Loan loan) {
    loans.add(loan);
  }

  public static Customer getCustomer(int id) {
    for (int i=0; i<customers.size(); i++) {
      if (customers.get(i).customerId == id) return customers.get(i);
    }

    return null;
  }

  public static Loan getLoanTypeDetail(int loanTypeId) {
    for (int i=0; i<loans.size(); i++) {
      if (loans.get(i).loanTypeId == loanTypeId) return loans.get(i);
    }

    return null;
  }

  public static String applyForLoan(LoanApplication application) {
    Loan loanType = application.loanType;
    Customer customer = application.customer;

    if (customer.age < loanType.minAge || customer.annualSalary < loanType.minSalary) {
      application.status = LoanStatus.REJECTED;
      applications.add(application);
      return "Loan Rejected!";
    } 

    application.status = LoanStatus.APPROVED;
    applications.add(application);
    return "Loan Approved!";
  }

  public static LoanApplication getLoanApplicationDetails(int id) {
    for (int i=0; i<applications.size(); i++) {
      if (applications.get(i).applicationId == id) return applications.get(i);
    }

    return null;
  }

  public static int generateApplicationId() {
    return applications.size() + 1;
  }

  public static ArrayList<LoanApplication> getApplications() {
    return applications;
  }
}
