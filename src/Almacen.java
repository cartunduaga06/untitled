import java.util.ArrayList;

public class Almacen {

    private String nombre;
    private ArrayList<Producto> productos;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarproducto(String producto) throws Exception {
        Producto nuevoProducto = FabricaProducto.agregarproducto(producto);
        this.productos.add(nuevoProducto);
    }

    public double calcularEspacioNecesario(){
        double espaciototal = 0;
        for (Producto producto: this.productos
             ) {
            espaciototal += producto.calcularEspacio();

        }
        return espaciototal;
    }

}
