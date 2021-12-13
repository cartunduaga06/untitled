public class FabricaProducto {

    public static  Producto agregarproducto(String tipo) throws Exception {
       return switch (tipo){
            case "CAJA10X10" -> new Caja(10,10,10,10);
            case "PELOTAFUTBOL" -> new Pelota(10, 11);
            case "PELOTATENIS" -> new Pelota(10,0.32);
           default -> throw new Exception();
        };
    }
}
