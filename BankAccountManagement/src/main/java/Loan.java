import java.util.Date;

public class Loan {
    // Atributos
    private String currencyType;
    private double amount;
    private Date startDate;
    private Date endDate;

    // Constructor
    public Loan(String currencyType, double amount, Date startDate, Date endDate) {
        this.currencyType = currencyType;
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
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