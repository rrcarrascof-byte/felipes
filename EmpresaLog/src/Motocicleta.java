public class Motocicleta extends Vehiculo implements Costo_de_Mantenimiento{
    private String tipo_combustible;

    public Motocicleta() {
    }

    public Motocicleta(String codigo, String marca, String modelo, int annio_fabricacion,
                       int kilometraje, boolean mantenimiento_previo_mensual, String tipo_combustible) {
        super(codigo, marca, modelo, annio_fabricacion, kilometraje, mantenimiento_previo_mensual);
        this.tipo_combustible = tipo_combustible;
    }

    public String getTipo_combustible() {
        return tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    @Override
    public double calculo_mantenimiento() {
        // Descuento del 8% => se paga el 92% del valor base
        if ("Eléctrica".equalsIgnoreCase(tipo_combustible))
            return VALOR_BASE_MANTENIMIENTO * 0.92;
        else
            return VALOR_BASE_MANTENIMIENTO;
    }

    @Override
    public String toString() {
        return super.toString() + " | Combustible: " + tipo_combustible;
    }
}
