package clase2;

import javafx.scene.control.TableColumn;

import javax.swing.*;
import java.util.Arrays;

public class EntradaDatos2 {
    public static void main (String[] args){

        String nombre = JOptionPane.showInputDialog("introduce tu nombre");

        String edad = JOptionPane.showInputDialog("introduce tu edad");

        System.out.println("tu nombre es: " + nombre + " y tienes " + edad +  " años.");
    }

}
