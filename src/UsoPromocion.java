public class UsoPromocion {
    private Integer code;
    private Descuento descuento;
    private Usuario usuario;
    private String fecha;

    public UsoPromocion(Integer code, Descuento descuento, Usuario usuario, String fecha) {
        this.code = code;
        this.descuento = descuento;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Descuento getDescuento() {
        return descuento;
    }

    public void setDescuento(Descuento descuento) {
        this.descuento = descuento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
