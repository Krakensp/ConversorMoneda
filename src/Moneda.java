public class Moneda {
    private String nombre;
    private double tipoCambio;

    public Moneda(String nombre, double tipoCambio) {
        this.nombre = nombre;
        this.tipoCambio = tipoCambio;
    }

    public double convierteAPesos(double cantidadDivisa){
        return this.tipoCambio * cantidadDivisa;
    }

    public double convierteADivisa(double cantidadPesos){
        return cantidadPesos / this.tipoCambio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
}
