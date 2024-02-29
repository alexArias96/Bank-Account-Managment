import java.util.Date;

public class Loan {
    // Atributos
    private int idLoan;
    private String currencyType;
    private double amount;
    private Date startDate;
    private Date endDate;

    // Constructor
    public Loan(int idLoan, String currencyType, double amount, Date startDate, Date endDate) {
        this.idLoan = idLoan;
        this.currencyType = currencyType;
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public double makePayment(double paymentAmount) {

        if (paymentAmount <= 0) {
            throw new IllegalArgumentException("Monto a ingresar invalido");
        }


        double newAmount = amount - paymentAmount;


        if (newAmount < 0) {
            throw new IllegalArgumentException("El monto a abonar debe ser menor al del total del préstamo");
        }

        // Update the loan amount
        this.amount = newAmount;

        // Return the new loan amount
        return newAmount;
    }
    // Getters y Setters
    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getIdLoan() {
        return idLoan;
    }

    public void setIdLoan(int idLoan) {
        this.idLoan = idLoan;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Loan{" +
                "currencyType='" + currencyType + '\'' +
                ", amount=" + amount +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}