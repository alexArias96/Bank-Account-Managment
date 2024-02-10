public class People extends Bank{
    private String name;
    private String lastName;
    private String ID;
    private String address;
    private String contact;

    // Constructors

    public People(String bankName, String address, String contact, ArrayList<Customer> clients, ArrayList<Loan> loans, ArrayList<SavingsAccount> savingsAccount, ArrayList<CurrentAccount> currentsAccount, ArrayList<DebitCard> debitsCard, ArrayList<CurrentCard> currentsCard, String name, String lastName, String ID, String address1, String contact1) {
        super(bankName, address, contact, clients, loans, savingsAccount, currentsAccount, debitsCard, currentsCard);
        this.name = name;
        this.lastName = lastName;
        this.ID = ID;
        this.address = address1;
        this.contact = contact1;
    }
}