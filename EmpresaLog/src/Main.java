import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1. Instanciar el gestor
        GestorVehiculos gestor = new GestorVehiculos();

        // 2. Registrar 3 camiones, 2 furgonetas y 2 motocicletas
        System.out.println("---- REGISTRO DE VEHÍCULOS ----");
        gestor.agregarVehiculo("Camion", new Camion("CAM001", "Volvo", "FH16", 2019, 35000, true, 25.0));
        gestor.agregarVehiculo("Camion", new Camion("CAM002", "Scania", "R450", 2021, 15000, true, 18.5));
        gestor.agregarVehiculo("Camion", new Camion("CAM003", "Mercedes-Benz", "Actros", 2018, 52000, false, 30.0));

        gestor.agregarVehiculo("Furgoneta", new Furgoneta("FUR001", "Renault", "Master", 2022, 12000, true, 13.0));
        gestor.agregarVehiculo("Furgoneta", new Furgoneta("FUR002", "Peugeot", "Boxer", 2019, 40000, false, 11.5));

        gestor.agregarVehiculo("Motocicleta", new Motocicleta("MOT001", "Honda", "CB190", 2020, 8000, false, "Gasolina"));
        gestor.agregarVehiculo("Motocicleta", new Motocicleta("MOT002", "Super Soco", "TC Max", 2023, 3000, true, "Eléctrica"));

        // 3. Probar validación de duplicidad (código CAM001 ya existe)
        System.out.println("\n---- PRUEBA DE DUPLICIDAD ----");
        gestor.agregarVehiculo("Camion", new Camion("CAM001", "Iveco", "Stralis", 2020, 10000, true, 20.0));

        // 4. Listado completo, agrupado y ordenado por categoría
        System.out.println("\n---- LISTADO COMPLETO DE LA FLOTA ----");
        gestor.listarTodosLosVehiculos();

        // 5. Solo la categoría "Camion"
        System.out.println("\n---- SOLO CAMIONES ----");
        List<Vehiculo> camiones = gestor.obtenerVehiculosPorTipo("Camion");
        for (Vehiculo v : camiones) {
            System.out.println("  " + v);
        }

        // 6. Totales
        System.out.println("\n---- RESUMEN ----");
        System.out.println("Total de vehículos: " + gestor.obtenerTotalVehiculos());
        System.out.printf("Costo total de mantenimiento mensual: $%,.1f%n",
                gestor.calcularCostoTotalMantenimiento());
    }
}
