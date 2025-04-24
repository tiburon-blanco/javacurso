package condicionales;

import java.sql.SQLOutput;
import java.util.Scanner;

public class OperadorBucle2 {
    public static void main(String[] args){

        int aleatorio=(int)(Math.random()*100);

        Scanner entrada=new Scanner(System.in);

        int intentos=0;

        int numeroUsuario=0;

        while (aleatorio!=numeroUsuario){
            intentos++;

            System.out.println("introduce un numero entre 1 y 100");

            numeroUsuario=entrada.nextInt();

            if (aleatorio>numeroUsuario) System.out.println("numero mas alto");

            else if (aleatorio<numeroUsuario) System.out.println("mas bajo");

        }

        System.out.println("correcto. Lo has adivinado en: " + intentos + " intentos.");
    }
}
