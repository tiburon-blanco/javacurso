/**
 * Ejercicio 4
 *
 * Desarrolla un programa que solicite al usuario ingresar tres números e imprima el
 * mayor de ellos.
 */
package clase2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);



        System.out.println("ingrese numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("ingrese numero 2");
        int numero2 = scanner.nextInt();
        System.out.println("ingrese numero 2");
        int numero3 = scanner.nextInt();

        int mayor;
        
        if(numero1 < numero2 && numero2 < numero3){
            mayor = numero3;            
        } else if (numero1> numero2 && numero2> numero3) {
            mayor = numero1;}
            else{
                mayor = numero2;
            
        }

        System.out.println("el mayor de los tres es; " + mayor);
    }
}
