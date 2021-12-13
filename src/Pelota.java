public class Pelota extends Producto{

    private double radio;

    public Pelota(double peso, double radio) {
        super(peso);
        this.radio = radio;
    }

    @Override
    double calcularEspacio() {
        return (4/3)*(Math.PI*(Math.pow(radio,3)));

    }
}
