public class Oferta extends Descuento{
    private Double porcentaje;
    private Integer code;
    private String name;
    private  String fechaInicio;
    private String fechaFin;

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }
}
