public class Promocion extends Descuento{
    private Double precio;
    private Integer code;
    private String name;
    private  String fechaInicio;
    private String fechaFin;

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
