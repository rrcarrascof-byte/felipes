import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GestorVehiculos {

    // TreeMap mantiene las claves (categorías) ordenadas alfabéticamente
    private Map<String, List<Vehiculo>> flota;

    public GestorVehiculos() {
        this.flota = new TreeMap<>();
    }

    public Map<String, List<Vehiculo>> getFlota() {
        return flota;
    }

    // Busca el código en TODAS las listas del mapa
    private boolean existeCodigo(String codigo) {
        for (List<Vehiculo> lista : flota.values()) {
            for (Vehiculo v : lista) {
                if (v.getCodigo().equalsIgnoreCase(codigo)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean agregarVehiculo(String tipo, Vehiculo v) {
        if (existeCodigo(v.getCodigo())) {
            System.out.println("ERROR: ya existe un vehículo con el código " + v.getCodigo()
                    + ". No se agregó.");
            return false;
        }
        // Si la categoría no existe, se crea con una lista vacía
        if (!flota.containsKey(tipo)) {
            flota.put(tipo, new ArrayList<>());
        }
        flota.get(tipo).add(v);
        System.out.println("Vehículo " + v.getCodigo() + " agregado a la categoría " + tipo + ".");
        return true;
    }

    public List<Vehiculo> obtenerVehiculosPorTipo(String tipo) {
        if (flota.containsKey(tipo)) {
            return flota.get(tipo);
        }
        return new ArrayList<>();
    }

    public void listarTodosLosVehiculos() {
        for (Map.Entry<String, List<Vehiculo>> entrada : flota.entrySet()) {
            System.out.println("=== " + entrada.getKey() + " (" + entrada.getValue().size() + ") ===");
            for (Vehiculo v : entrada.getValue()) {
                System.out.println("  " + v);
            }
        }
    }

    public int obtenerTotalVehiculos() {
        int total = 0;
        for (List<Vehiculo> lista : flota.values()) {
            total += lista.size();
        }
        return total;
    }

    public double calcularCostoTotalMantenimiento() {
        double total = 0;
        for (List<Vehiculo> lista : flota.values()) {
            for (Vehiculo v : lista) {
                total += v.calculo_mantenimiento();
            }
        }
        return total;
    }
}
