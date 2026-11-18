import java.util.Date;

public class OrdenCompra {
    private static int contador = 0;
    private Integer identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];
    private int indiceProducto = 0;

    public OrdenCompra(String descripcion) {
        this.identificador = ++contador;
        this.descripcion = descripcion;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void addProducto(Producto producto) {
        if (indiceProducto < productos.length) {
            productos[indiceProducto++] = producto;
        }
    }

    public int getGranTotal() {
        int total = 0;
        for (Producto p : productos) {
            if (p != null) {
                total += p.getPrecio();
            }
        }
        return total;
    }
}
