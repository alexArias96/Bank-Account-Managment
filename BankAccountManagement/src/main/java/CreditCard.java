public class CreditCard {
    // Atributos
    private double creditCardConsumption;

    // Constructor
    public CreditCard(double creditCardConsumption) {
        this.creditCardConsumption = creditCardConsumption;
    }

    // Getter y Setter
    public double getCreditCardConsumption() {
        return creditCardConsumption;
    }

    public void setCreditCardConsumption(double creditCardConsumption) {
        this.creditCardConsumption = creditCardConsumption;
    }

    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "CreditCard{" +
                "creditCardConsumption=" + creditCardConsumption +
                '}';
    }
}