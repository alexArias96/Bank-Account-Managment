import java.util.ArrayList;

public class Bank {
    private String bankName;
    private String address;
    private String contact;
    private ArrayList<Customer> clients;
    private ArrayList<Loan> loans;
    private ArrayList<SavingsAccount> savingsAccount;
    private ArrayList<CurrentAccount> currentsAccount;
    private ArrayList<DebitCard> debitsCard;
    private ArrayList<CurrentCard> currentsCard;

    // Constructors

    public Bank(String bankName, String address, String contact, ArrayList<Customer> clients, ArrayList<Loan> loans, ArrayList<SavingsAccount> savingsAccount, ArrayList<CurrentAccount> currentsAccount, ArrayList<DebitCard> debitsCard, ArrayList<CurrentCard> currentsCard) {
        this.bankName = bankName;
        this.address = address;
        this.contact = contact;
        this.clients = clients;
        this.loans = loans;
        this.savingsAccount = savingsAccount;
        this.currentsAccount = currentsAccount;
        this.debitsCard = debitsCard;
        this.currentsCard = currentsCard;
    }
}