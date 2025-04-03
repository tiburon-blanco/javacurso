/**
 * Ejercicio 5
 *
 * Los tramos impositivos para la declaración de la renta en un determinado país son los siguientes:
 * Renta Tipo impositivo
 * Menos de 10000€ 5%
 * Entre 10000€ y 20000€ 15%
 * Entre 20000€ y 35000€ 20%
 * Entre 35000€ y 60000€ 30%
 * Más de 60000€ 45%
 * Escribir un programa que pregunte al usuario su renta anual y muestre por pantalla el tipo
 * impositivo que le corresponde y la cantidad a abonar.
 */

package clase2;

import java.util.Scanner;

public class Ejercicio5 {
    static public void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su renta: ");
        int renta = scanner.nextInt();

        double impuesto = 0;

        if(renta <= 10000){
            impuesto = renta * 0.05;
        } else if (renta > 10000 && renta <= 35000) {
            impuesto = renta *0.10;}
        else {impuesto = renta *0.15;}




        System.out.println("Para la renta de: "+ renta + ", " + "el importe a abonar es "+ impuesto);
    }
}
