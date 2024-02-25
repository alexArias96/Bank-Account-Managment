/*
Crea un proyecto Java:

-Que solucione un problema que conozcas actualmente

Que requerimos:
-Un sistema de clases
-Aplicacion de TODOS los principios SOLID al sistema anterior

Entregables:
-Un diagrama de clases con el sistema disenhado de acuerdo al proceso de abstraccion
-Un proyecto MAVEN basico pero funcional con las dependencias necesarias y plugins, asi como con todas las clases e interfaces disenhadas previamente.
 Aplicar buenas practicas y codestyling.

No se requiere:
-Uso de bases de datos
-Conexiones a APIS/Web services
-Front end
 */
/*
Como proyecto hemos creado una aplicación de gestión de cuentas banacarias.
 */


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BankAccountManagement {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int option;
        do {

            System.out.println("\n************* Bienvenido a nuestra banca en línea *****************\n");

            System.out.println("1.- Crear nueva cuenta");
            System.out.println("2.- Consultar saldo");
            System.out.println("3.- Realizar deposito");
            System.out.println("4.- Realizar retiro");
            System.out.println("5.- Solicitar prestamo");
            System.out.println("6.- Realizar pago de prestamo");
            System.out.println("7.- Solicitar tarjeta de credito");
            System.out.println("8.- Realizar pago de tarjeta de credito");
            System.out.println("0.- Salir\n");
            System.out.println("Ingrese el numero de la opcion a solicitar:");
            option = entrada.nextInt();
            if(option ==0 ){

                System.out.println("\nGracias, hasta luego !!!!!");
            } else if (option>0 && option<9){
                Menu.action(option);
            }else {
                System.out.println("\t\t ERROR!!!!!!");
                System.out.println("Ingrese un numero entre 1 al 8");
            }

        } while(option !=0);
    }


}