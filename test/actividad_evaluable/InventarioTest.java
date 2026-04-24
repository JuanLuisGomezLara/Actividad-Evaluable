package actividad_evaluable;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class InventarioTest {
    @Test
    public void testAnadirProducto() {
        Inventario inventario = new Inventario();
        Producto producto = new Producto("Ratón", 10.0, 5);
        inventario.anadirProducto(producto);
        assertEquals(1, inventario.obtenerNumeroProductos());
    }
    @Test
    public void testCalcularValorInventario() {
        Inventario inventario = new Inventario();
        Producto producto1 = new Producto("Teclado", 20.0, 2);
        Producto producto2 = new Producto("Ratón", 10.0, 3);
        inventario.anadirProducto(producto1);
        inventario.anadirProducto(producto2);
        double resultado = inventario.calcularValorInventario();
        assertEquals(70.0, resultado, 0.001);
    }
    @Test
    public void testCalcularValorTotalProducto() {
        Producto producto = new Producto("Monitor", 150.0, 2);
        double resultado = producto.calcularValorTotal();
        assertEquals(300.0, resultado, 0.001);
    }
    @Test
    public void testAumentarCantidadProducto() {
        Producto producto = new Producto("USB", 5.0, 10);
        producto.aumentarCantidad(5);
        assertEquals(15, producto.getCantidad());
    }
}
