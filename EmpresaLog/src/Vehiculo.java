public abstract class Vehiculo implements Costo_de_Mantenimiento {

    protected String codigo;
    protected String marca;
    protected String modelo;
    protected int annio_fabricacion;
    protected int kilometraje;
    protected boolean mantenimiento_previo_mensual;

    public Vehiculo() {
    }

    public Vehiculo(String codigo, String marca, String modelo, int annio_fabricacion,
                    int kilometraje, boolean mantenimiento_previo_mensual) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.annio_fabricacion = annio_fabricacion;
        this.kilometraje = kilometraje;
        this.mantenimiento_previo_mensual = mantenimiento_previo_mensual;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnnio_fabricacion() {
        return annio_fabricacion;
    }

    public void setAnnio_fabricacion(int annio_fabricacion) {
        this.annio_fabricacion = annio_fabricacion;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isMantenimiento_previo_mensual() {
        return mantenimiento_previo_mensual;
    }

    public void setMantenimiento_previo_mensual(boolean mantenimiento_previo_mensual) {
        this.mantenimiento_previo_mensual = mantenimiento_previo_mensual;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                " | Marca: " + marca +
                " | Modelo: " + modelo +
                " | Año: " + annio_fabricacion +
                " | Km: " + kilometraje +
                " | Mant. preventivo: " + (mantenimiento_previo_mensual ? "Sí" : "No") +
                " | Costo mant.: $" + String.format("%,.1f", calculo_mantenimiento());
    }
}
