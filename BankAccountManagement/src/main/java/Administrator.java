import java.util.*;

public class Administrator extends People {
    // Constructor
    public Administrator(String bankName, String address, String contact,
                         ArrayList<Customer> clients, ArrayList<Loan> loans,
                         ArrayList<SavingsAccount> savingsAccount, ArrayList<CurrentAccount> currentsAccount,
                         ArrayList<DebitCard> debitsCard,
                         String name, String lastName, String ID, String address1, String contact1) {
        super(bankName, address, contact, clients, loans, savingsAccount, currentsAccount, debitsCard, name, lastName, ID, address1, contact1);
    }

    public void performAdministratorOperation() {
        // Implementa la lógica específica para operaciones de administrador
        System.out.println("Performing administrator operation");
    }
}
