package clase2;

import javafx.scene.control.TableColumn;

import javax.swing.*;
import java.util.Arrays;

public class EntradaDatos2 {
    public static void main (String[] args){

        String nombre =  JOptionPane.showInputDialog("introduce tu nombre");

        int edad = Integer.parseInt(JOptionPane.showInputDialog("introduce tu edad"));

        double salario =Double.parseDouble( JOptionPane.showInputDialog("introduce tu salario"));

        System.out.println("tu nombre es: " + nombre + " y tienes " + edad +  " años. Y tienes un salario de $ " + salario);
    }

}
