import java.sql.SQLOutput;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String text = "Hola Mundo!";

        int largo = text.length();
        System.out.println(largo);

        String texto = text.replace("Hola", "chao");
        System.out.println(text);

        System.out.println(texto.endsWith("undo!"));
        System.out.println(texto.startsWith("Ch"));
        System.out.println(texto.contains("und"));
        System.out.println(texto.indexOf("Mund"));
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());

        String malo = "        chanchito feliz";
        System.out.println(malo.trim());

        String titulo = " CONTENIDO DE ARRAY";

        System.out.println(titulo);

        int [] numeros = new int[5];
        numeros[0] = 5;
        numeros[4] = 7;
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros.length);
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        int[] number = {0,1,2,3,4};
        System.out.println(Arrays.toString(number));


        String titulo2 = "Multiples dimensiones";

        System.out.println(titulo2);

        int[][][] zahlen = new int [3][2][2];
        zahlen [0][0][0] = 5;
        System.out.println(Arrays.deepToString(zahlen));

        /**
         * estp es un comentario /** y se hace automaticamente
         * y salta de linea sin hacer nada
         */

        String constantes = "Constantes";

        System.out.println("Seccion que habla de " + constantes);

        final String empresa = "Hola Mundo Limited";
        System.out.println(empresa);

        String operadores = "Operadores Aritmeticos";
        System.out.println(operadores);
        int a = 2 + 2;
        int b = 2 - 2;
        int c = 3 * 3;
        int m = 4 % 3;
        float d = 10f / 3f;
        double e = 10 / 3.0;

        int x = 5;
        // int y = x++;
        x +=  5;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(m);
        System.out.println(d);
        System.out.println(e);
        System.out.println(x);
        // System.out.println(y);

        String OrdenOperaciones = "Orden de operaciones";
        System.out.println(OrdenOperaciones);
        /**
         * PEMDAS
         * parentesis
         * potencia
         * multiplicacion
         * division
         * suma
         * resta
          */
        int r = 5 + 3 *2;
        int O = (5 + 3) *2;

        System.out.println(r);
        System.out.println(O);

        String titulo3 = "Conversion de tipos";
        System.out.println(titulo3);

        /**
         * SIempre esta dentro de la clasee public main de las primeras lineas y la opcion public static void main (String[] args )
         */
            byte z = 1;
            int k = 15;
        /**
         * conversion implicita
         */
        double l = a + b;
            System.out.println(l);
        int v = 15;
        double k = 15.015;
        int

    }
    }

