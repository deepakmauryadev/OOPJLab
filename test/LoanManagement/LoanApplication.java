public class LoanApplication {
  int applicationId;
  Customer customer;
  Loan loanType;
  double amount;
  LoanStatus status;

  LoanApplication(int applicationId, Customer customer, Loan loanType, double amount) {
    this.applicationId = applicationId;
    this.customer = customer;
    this.loanType = loanType;
    this.amount = amount;
    this.status = LoanStatus.PENDING;
  }
}
