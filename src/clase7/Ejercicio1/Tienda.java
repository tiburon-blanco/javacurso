/**
 * Ejercicio 1
 *
 * Una tienda de electrónica (nombre, dirección, teléfono) desea implementar un
 * sistema para gestionar su inventario de productos (nombre, categoría, precio,
 * cantidad en stock). Además, se podrán realizar ventas, las cuales deben recibir y
 * devolver el producto a ser vendido, descontar el stock del producto e informar el
 * monto a pagar.
 * El sistema debe permitir:
 * 1) Consultar cuántas unidades de un producto específico quedan en stock.
 * 2) Realizar una venta, que a partir del nombre del producto y cantidad, descontar
 * el stock correspondiente y mostrar el total a pagar.
 */

package clase7.Ejercicio1;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Tienda {
    String tienda;
    String direccion;
    int telefono;
    ArrayList<Producto> productos;

    public Tienda(String tienda, String direccion, int telefono) {
        this.tienda = tienda;
        this.direccion = direccion;
        this.telefono = telefono;
        this.productos = new ArrayList<>();
    }

   public void agregarProducto(Producto p){
        productos.add(p);
    }

    public void consultarStock(String nombreProducto){
        for (Producto p : productos){
            if(p.getNombre().equalsIgnoreCase(nombreProducto)){
                System.out.println("stock disponible de " + nombreProducto + ": " + p.getStock()+ " unidades");
            }
            return;
        }
        System.out.println("producto no encontrado");
    }



    public void mostrarProductos() {
        System.out.println("Inventario actual:");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    }
