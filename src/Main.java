public class Main {
    public static void main(String[] args) {
    Promocion promocion = new Promocion();
    promocion.setPrecio(10.0);
    promocion.setCode(1);
    promocion.setName("palomitas");
    promocion.setFechaInicio("hoy");
    promocion.setFechaFin("mannana");

    Usuario usuario = new Usuario("12345679A","Paco","paco@correo.es");
    UsoPromocion usoPromocion = new UsoPromocion(1,promocion,usuario,"hoy");
    }
}
