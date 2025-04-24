package condicionales;

import java.util.Scanner;

public class OperatorTernario {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce la edad: ");

        int edad = entrada.nextInt();

        /* if (edad < 18) System.out.println("Eres menor de edad");

        Ternario (3) condicion? valor si verdad: valor si no verdad

        else System.out.println("eres mayor de edad"); */

        String resultado= (edad<18)? " eres menor de edad" : "eres mayor de edad";

        System.out.println(resultado);



    }
}
