public interface LoanRepository {
    Loan findLoanById(int id);
    void saveLoan(Loan loan);
}