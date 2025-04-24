package condicionales;

import java.sql.SQLOutput;
import java.util.*;
public class CondicionalIf {
    public static void main (String[] args){

        Scanner entrada= new Scanner(System.in);

        System.out.println("Introduce tu edad, por favor");

        int edad=entrada.nextInt();

        if (edad<=18)System.out.println("Eres joven");
        else if (edad<=35)System.out.println("Eres adulto");
        else if (edad<=60)System.out.println("Eres adulto mayor");
        else System.out.println("eres mayor de edad");



    }

}
