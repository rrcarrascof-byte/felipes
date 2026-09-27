public class Camion extends Vehiculo implements Costo_de_Mantenimiento{
    private double max_carga_toneladas;

    public Camion() {
    }

    public Camion(String codigo, String marca, String modelo, int annio_fabricacion,
                  int kilometraje, boolean mantenimiento_previo_mensual, double max_carga_toneladas) {
        super(codigo, marca, modelo, annio_fabricacion, kilometraje, mantenimiento_previo_mensual);
        this.max_carga_toneladas = max_carga_toneladas;
    }

    public double getMax_carga_toneladas() {
        return max_carga_toneladas;
    }

    public void setMax_carga_toneladas(double max_carga_toneladas) {
        this.max_carga_toneladas = max_carga_toneladas;
    }

    @Override
    public double calculo_mantenimiento() {
        if (kilometraje > 20000)
            return VALOR_BASE_MANTENIMIENTO * 1.10;
        else
            return VALOR_BASE_MANTENIMIENTO;
    }

    @Override
    public String toString() {
        return super.toString() + " | Carga máx.: " + max_carga_toneladas + " t";
    }
}
