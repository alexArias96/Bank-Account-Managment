import java.util.*;

public class Customer extends People implements IOperationCustomer {
    // Constructor
    public Customer(String bankName, String address, String contact,
                    ArrayList<Customer> clients, ArrayList<Loan> loans,
                    ArrayList<SavingsAccount> savingsAccount, ArrayList<CurrentAccount> currentsAccount,
                    ArrayList<DebitCard> debitsCard,
                    String name, String lastName, String ID, String address1, String contact1) {
        super(bankName, address, contact, clients, loans, savingsAccount, currentsAccount, debitsCard, name, lastName, ID, address1, contact1);
    }

    @Override
    public void performCustomerOperation() {
        // Implementa la lógica específica para operaciones de cliente
        System.out.println("Performing customer operation");
    }
}
