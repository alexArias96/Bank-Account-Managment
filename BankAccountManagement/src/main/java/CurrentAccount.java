public class CurrentAccount extends Account{

    public CurrentAccount(){
    }

    public CurrentAccount(int accountType, String accountNumber, String debitCard, String creditCard, Double balance, String holder) {
        super(accountType, accountNumber, debitCard, creditCard, balance, holder);
    }
}
