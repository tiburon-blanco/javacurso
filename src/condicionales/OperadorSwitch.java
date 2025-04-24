package condicionales;

import java.util.Scanner;

/**
 * Condicional switch
 * Switch (valor a evaluar){
 *      Case valor1:
 *          codigo a ejecutar
 *          Break;
 *      Case valor2:
 *  *       codigo a ejecutar
 *  *       Break;
 *  }
 *  Todo lo que puedo hacer con un switch lo puedo hacer con un if y no siempre al reves.
 */
public class OperadorSwitch {
    public static void main (String[] args){

            Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce el numero de mes: ");

            int numero_mes = entrada.nextInt();

            switch(numero_mes){
                case 1:
                    System.out.println("enero");
                    break;
                case 2:
                    System.out.println("febrero");
                    break;
                default:
                    System.out.println("n° incorrecto");
            }
    }

    }

