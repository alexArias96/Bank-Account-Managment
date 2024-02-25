public class Account {

    private  int accountType;
    private String accountNumber;
    private String debitCard;
    private String creditCard;
    private Double balance;
    private String holder;

    public Account() {
    }

    public Account(int accountType, String accountNumber, String debitCard, String creditCard, Double balance, String holder) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.debitCard = debitCard;
        this.creditCard = creditCard;
        this.balance = balance;
        this.holder = holder;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(String debitCard) {
        this.debitCard = debitCard;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }


}
