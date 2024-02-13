import java.util.ArrayList;

public class Administrator extends People {

    private Bank bank;

    // Constructor que toma parámetros para People y Bank
    public Administrator(String name, String lastName, String ID, String address, String contact, Bank bank) {
        super(name, lastName, ID, address, contact);
        this.bank = bank;
    }

    // Getter para obtener la instancia de Bank
    public Bank getBank() {
        return bank;
    }

    // Setter para establecer una nueva instancia de Bank
    public void setBank(Bank newBank) {
        this.bank = newBank;
    }

    // Puedes añadir otros métodos específicos para la clase Administrator si es necesario
}
