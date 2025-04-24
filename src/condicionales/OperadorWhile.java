package condicionales;

import javax.swing.*;
import java.sql.SQLOutput;

/**Sintaxis
 * while (condicion){
 *     linea 1
 *     linea 2
 *     linea 3
 * }
 *
 */

public class OperadorWhile {
    public static void main(String[] args){
        String clave="Lunes";

        String pass="";

        while(clave.equals(pass)==false){

            pass= JOptionPane.showInputDialog("introduce contraseña");

            if(clave.equals(pass)==false) System.out.println("contraseña incorrecta");
        }
        System.out.println("Acceso correcto");
    }
}
