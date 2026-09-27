public class Furgoneta extends Vehiculo implements Costo_de_Mantenimiento{
    private double volumen_carga;

    public Furgoneta() {
    }

    public Furgoneta(String codigo, String marca, String modelo, int annio_fabricacion,
                     int kilometraje, boolean mantenimiento_previo_mensual, double volumen_carga) {
        super(codigo, marca, modelo, annio_fabricacion, kilometraje, mantenimiento_previo_mensual);
        this.volumen_carga = volumen_carga;
    }

    public double getVolumen_carga() {
        return volumen_carga;
    }

    public void setVolumen_carga(double volumen_carga) {
        this.volumen_carga = volumen_carga;
    }

    @Override
    public double calculo_mantenimiento() {
        if (annio_fabricacion > 2020)
            return VALOR_BASE_MANTENIMIENTO * 1.05;
        else
            return VALOR_BASE_MANTENIMIENTO;
    }

    @Override
    public String toString() {
        return super.toString() + " | Volumen: " + volumen_carga + " m³";
    }
}
