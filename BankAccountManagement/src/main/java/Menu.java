import java.util.Scanner;

public class Menu {

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
                if (remove > 0.0 ){
                    System.out.println("retiro");
                }
                break;
            case 5:
                System.out.println("Solicitar Prestamo:\n");
                break;
            case 6:
                System.out.println("Ingrese numero del prestamos:\n");
                optionMenu = entrada.nextInt();
                System.out.println("Ingrese la cantidad a pagar:\n");
                amount = entrada.nextDouble();
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
