/**
 * Ejercicio 3
 *
 * Pedí al usuario un número del 1 al 7 e imprime el día de la semana correspondiente.
 * Usar switch.
 */

package clase2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void  main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese numero del 1 al 7: ");

        int numero = scanner.nextInt();
        String dia;


        switch (numero){
            case 1:
                dia = "lunes";
                break;
            case 2:
                dia = "martes";
                break;
            case 3:
                dia = "miercoles";
                break;
            case 4:
                dia = "hos es jueves";
                break;
            case 5:
                dia = "hos es viernes";
                break;
            case 6:
                dia = "sabados";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                dia= "El numero ingresado es invalido, ingrese numero del 1 al 7";
        }

        System.out.println(dia);

    }
}
