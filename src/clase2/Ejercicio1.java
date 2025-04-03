/**
 * Ejercicio 1
 *
 * Crea un programa que calcule el área de un círculo utilizando una constante para el
 * valor de π y que solicite al usuario el radio del círculo.
 * Hint 1: Math.PI
 * Hint 2: área de un círculo = πr2
 */

package clase2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el radio del circulo: ");

        int radio = scanner.nextInt();

        double area = Math.PI * radio * radio;


        System.out.println("el area del circulo es: " + area);

    }
}
