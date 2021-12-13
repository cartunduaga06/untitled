public class Caja extends Producto{
private double longitud;
private double ancho;
private double anchura;

    public Caja(double peso, double longitud, double ancho, double anchura) {
        super(peso);
        this.longitud = longitud;
        this.ancho = ancho;
        this.anchura = anchura;
    }

    @Override
    double calcularEspacio() {
        return longitud*ancho*anchura;
    }
}
