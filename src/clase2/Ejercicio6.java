/**
 * Ejercicio 6
 *
 * Pedì al usuario su edad e imprimí si está en la categoría de niño, adolescente, adulto
 * o adulto mayor.
 */

package clase2;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad < 18) {
            System.out.println("soy adolecente");
        } else if (edad >= 18 && edad < 65) {
            System.out.println("soy adulto");
        } else {
            System.out.println("soy viejo");
        }
    }
}
