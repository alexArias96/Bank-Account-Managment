public class SavingsAccount extends  Account{

    public SavingsAccount() {
    }

    public SavingsAccount(int accountType, String accountNumber, String debitCard, String creditCard, Double balance, String holder) {
        super(accountType, accountNumber, debitCard, creditCard, balance, holder);
    }
}
