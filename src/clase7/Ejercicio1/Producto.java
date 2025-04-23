/**
 * /**
 *  * Ejercicio 1
 *  *
 *  * Una tienda de electrónica (nombre, dirección, teléfono) desea implementar un
 *  * sistema para gestionar su inventario de productos (nombre, categoría, precio,
 *  * cantidad en stock). Además, se podrán realizar ventas, las cuales deben recibir y
 *  * devolver el producto a ser vendido, descontar el stock del producto e informar el
 *  * monto a pagar.
 *  * El sistema debe permitir:
 *  * 1) Consultar cuántas unidades de un producto específico quedan en stock.
 *  * 2) Realizar una venta, que a partir del nombre del producto y cantidad, descontar
 *  * el stock correspondiente y mostrar el total a pagar.
 *  */


package clase7.Ejercicio1;

public class Producto {
    String nombre;
    String categoria;
    Double precio;
    int inventario;

    public Producto(String nombre, String categoria, Double precio, int inventario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.inventario = inventario;
    }

    public String getNombre(){
        return nombre;
    }
    public int getStock(){
        return inventario;
    }

    public double getPrecio(){
        return precio;
    }
    public void descontarStock(int cantidad){
        this.inventario -= cantidad;
    }
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Categoría: " + categoria + " | Precio: $" + precio + " | Stock: " + inventario);
    }
}
