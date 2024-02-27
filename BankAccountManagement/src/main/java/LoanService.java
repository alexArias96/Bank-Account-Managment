import java.util.Optional;

public class LoanService {
    private LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public Optional<Loan> makePayment(int loanId, double paymentAmount) {
        Loan loan = loanRepository.findLoanById(loanId);

        if (loan == null) {
            return Optional.empty();
        }

        try {
            loan.makePayment(paymentAmount);
            loanRepository.saveLoan(loan);
            return Optional.of(loan);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            return Optional.empty();
        }
    }
}