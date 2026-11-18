import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra("Orden de oficina");
        orden1.setCliente(new Cliente("Juan", "Perez"));
        orden1.setFecha(new Date());
        orden1.addProducto(new Producto("HP", "Impresora LaserJet", 250000));
        orden1.addProducto(new Producto("Logitech", "Mouse MX Master", 180000));
        orden1.addProducto(new Producto("Canon", "Camara EOS", 900000));
        orden1.addProducto(new Producto("Samsung", "Monitor 24 pulg", 450000));

        OrdenCompra orden2 = new OrdenCompra("Orden de computacion");
        orden2.setCliente(new Cliente("Maria", "Gomez"));
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("Dell", "Laptop Inspiron", 2500000));
        orden2.addProducto(new Producto("Lenovo", "Teclado Inalambrico", 120000));
        orden2.addProducto(new Producto("Asus", "Router WiFi", 200000));
        orden2.addProducto(new Producto("Seagate", "Disco Duro 1TB", 150000));

        OrdenCompra orden3 = new OrdenCompra("Orden de hogar");
        orden3.setCliente(new Cliente("Carlos", "Lopez"));
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("LG", "Televisor 55 pulg", 1800000));
        orden3.addProducto(new Producto("Sony", "Bocina Bluetooth", 300000));
        orden3.addProducto(new Producto("Philips", "Licuadora", 80000));
        orden3.addProducto(new Producto("Panasonic", "Microondas", 350000));

        imprimirOrden(orden1);
        imprimirOrden(orden2);
        imprimirOrden(orden3);
    }

    private static void imprimirOrden(OrdenCompra orden) {
        System.out.println("========================================");
        System.out.println("ID: " + orden.getIdentificador());
        System.out.println("Descripcion: " + orden.getDescripcion());
        System.out.println("Fecha: " + orden.getFecha());
        System.out.println("Cliente: " + orden.getCliente().getNombre() + " " + orden.getCliente().getApellido());
        System.out.println("Productos:");
        for (Producto p : orden.getProductos()) {
            if (p != null) {
                System.out.println("  - " + p.getFabricante() + " | " + p.getNombre() + " | " + p.getPrecio());
            }
        }
        System.out.println("Gran Total: " + orden.getGranTotal());
        System.out.println();
    }
}
