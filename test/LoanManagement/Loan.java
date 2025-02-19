public class Loan {
  int loanTypeId;
  String loanName;
  int minAge;
  double minSalary;

  Loan(int loanTypeId, String loanName, int minAge, double minSalary) {
    this.loanTypeId = loanTypeId;
    this.loanName = loanName;
    this.minAge = minAge;
    this.minSalary = minSalary;
  }
}
