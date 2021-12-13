public class Main {

    public static void main(String[] args) throws Exception {
        Almacen exito = new Almacen("El exito");
        exito.agregarproducto("CAJA10X10");
        exito.agregarproducto("PELOTAFUTBOL");
        exito.agregarproducto("PELOTATENIS");
        System.out.println(exito.calcularEspacioNecesario());
    }
}
