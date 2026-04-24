package actividad_evaluable;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void anadirProducto(Producto producto) {
        productos.add(producto);
    }

    public int obtenerNumeroProductos() {
        return productos.size();
    }

    public double calcularValorInventario() {
        double total = 0;

        for (Producto producto : productos) {
            total += producto.calcularValorTotal();
        }

        return total;
    }
}