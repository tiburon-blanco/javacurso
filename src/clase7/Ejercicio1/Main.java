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

public class Main {
    public static void main(String[] args){
        Tienda tienda = new Tienda("tito", "R peña y callado", 48116250);

        tienda.agregarProducto(new Producto("nombre", "categoria", 100.00, 16));
        tienda.agregarProducto(new Producto("nombre2", "categoria2", 1000.00, 160));
        tienda.agregarProducto(new Producto("nombre3", "categoria3", 200.00, 260));

        System.out.println(tienda.toString());
        System.out.println(tienda.productos);

    }
}
