/**
 * Ejercicio 7
 *
 * Escribir un programa que pida el ingreso de una nota (0 a 10). Si la nota es 7 o más, se
 * deberá informar “Nota sobresaliente”, si la nota está entre 4 y 6, se informará “Nota
 * regular”. Si la nota es menor a 4 se informará “Desaprobado”. En caso de que se
 * ingrese algún número fuera de rango se deberá informar el error.
 */

package clase2;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner((System.in));
        System.out.println("ingrese una nota del 0-10: ");
        int nota = scanner.nextInt();

        if (nota >= 0 && nota <= 10) {
            if (nota > 7) {
                System.out.println("nota sobresaliente");
            } else if (nota >= 4) {
                System.out.println("aprobado regular");
            } else {
                System.out.println("desaprobado");
            }
        } else{
                System.out.println("la nota debe ser entre 0 y 10");
            }
        }
        }



