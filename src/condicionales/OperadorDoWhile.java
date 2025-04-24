package condicionales;

import java.util.Scanner;

public class OperadorDoWhile {
    public static void main(String[] args){

        int aleatorio=(int)(Math.random()*100);

        Scanner entrada=new Scanner(System.in);

        int intentos=0;

        int numeroUsuario=0;

       do{
            intentos++;

            System.out.println("introduce un numero entre 0 y 99");

            numeroUsuario=entrada.nextInt();

            if (aleatorio>numeroUsuario) System.out.println("numero mas alto");

            else if (aleatorio<numeroUsuario) System.out.println("mas bajo");

        }  while (aleatorio!=numeroUsuario);

        System.out.println("correcto. Lo has adivinado en: " + intentos + " intentos.");
    }




}
