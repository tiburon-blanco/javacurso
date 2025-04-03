/**
 * Ejercicio 2
 *
 * Desarrolla un programa que solicite al usuario ingresar un número e imprima si es
 * par o impar, y si es positivo o negativo.
 */

package clase2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese numero: ");
        int numero = scanner.nextInt();

        if(numero > 0 ){
            System.out.println("el numero es positivo ");}
            else {
                System.out.println("el numero es negativo");
        }
            if (numero % 2 == 0){
                System.out.println("el nuemero es par");}
                else  {
                    System.out.println("el numero es impar");
                }
            }
    }

