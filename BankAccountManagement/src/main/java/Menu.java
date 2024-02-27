import java.util.Scanner;
import java.util.Optional;
public class Menu {
    private static LoanService loanService;
    public Menu(LoanService loanService) {
        Menu.loanService = loanService;
    }

    public static void action(int option) {
        Scanner entrada = new Scanner(System.in);
        int optionMenu;
        double amount, remove;

        switch (option){
            case 1:
                System.out.println("Seleccione el tipo de cuenta:\n");
                System.out.println("1.- Cuenta de Ahorro");
                System.out.println("2.- Cuenta Corriente");
                optionMenu = entrada.nextInt();

                break;
            case 2:
                System.out.println("Ingrese el numero de cuenta:\n");
                optionMenu = entrada.nextInt();
            case 3:
                System.out.println("Ingrese el numero de cuenta:\n");
                optionMenu = entrada.nextInt();
                System.out.println("Ingrese la cantidad a depositar:\n");
                amount = entrada.nextDouble();
                System.out.println(amount);
                if (amount > 0.0){
                    System.out.println("Deposito");
                }
                break;
            case 4:
                System.out.println("Ingrese el numero de cuenta:\n");
                optionMenu = entrada.nextInt();
                System.out.println("Ingrese la cantidad a retirar:\n");
                remove = entrada.nextDouble();

                Withdrawal withdrawal = new Withdrawal();
                withdrawal.getWithdrawal(remove);
                break;
            case 5:
                System.out.println("Solicitar Prestamo:\n");
                break;
            case 6:
                System.out.println("Ingrese numero del prestamo:\n");
                int loanId = entrada.nextInt();
                System.out.println("Ingrese la cantidad a pagar:\n");
                double paymentAmount = entrada.nextDouble();

                Optional<Loan> loanOptional = loanService.makePayment(loanId, paymentAmount);
                if (loanOptional.isPresent()) {
                    System.out.println("Pago realizado exitosamente.");
                } else {
                    System.out.println("No se encontró el préstamo con el ID especificado.");
                }
                break;
            case 7:
                System.out.println("Solicitar tarjeta de credito:\n");
                break;
            case 8:
                System.out.println("Ingrese el numero de tarjeta de credito:\n");
                optionMenu = entrada.nextInt();
                System.out.println("Ingrese la cantidad a pagar:\n");
                amount = entrada.nextDouble();
                System.out.println(amount);
                if (amount > 0.0){
                    System.out.println("Deposito");
                }
                break;
            default:
                System.out.println("Opcion no valida!!! ");
                break;
        }

    }
}
