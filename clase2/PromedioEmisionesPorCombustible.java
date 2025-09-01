import java.util.ArrayList;

class CategoriaVehiculo {
    String nombre;
    int cantidad;
    double porcentajeGasolina;
    double porcentajeDiesel;
    double porcentajeGas;

    public CategoriaVehiculo(String nombre, int cantidad, double gasolina, double diesel, double gas) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.porcentajeGasolina = gasolina;
        this.porcentajeDiesel = diesel;
        this.porcentajeGas = gas;
    }
}

public class PromedioEmisionesPorCombustible {
    public static void main(String[] args) {
        // Factores de emisión
        double factorGasolina = 2.3;
        double factorDiesel = 2.7;
        double factorGas = 1.8;

        // Lista de categorías
        ArrayList<CategoriaVehiculo> categorias = new ArrayList<>();
        categorias.add(new CategoriaVehiculo("Camiones Livianos", 400000, 0.30, 0.40, 0.30));
        categorias.add(new CategoriaVehiculo("Camiones Medianos", 280000, 0.25, 0.50, 0.25));
        categorias.add(new CategoriaVehiculo("Camiones Pesados", 380000, 0.10, 0.80, 0.10));
        categorias.add(new CategoriaVehiculo("Tractocamiones", 1150000, 0.05, 0.90, 0.05));
        categorias.add(new CategoriaVehiculo("Volquetas", 936000, 0.40, 0.40, 0.20));

        // Totales
        int totalGasolinaVehiculos = 0;
        int totalDieselVehiculos = 0;
        int totalGasVehiculos = 0;

        double totalGasolinaEmisiones = 0;
        double totalDieselEmisiones = 0;
        double totalGasEmisiones = 0;

        // Recorrer categorías
        for (CategoriaVehiculo c : categorias) {
            int gasolina = (int) (c.cantidad * c.porcentajeGasolina);
            int diesel = (int) (c.cantidad * c.porcentajeDiesel);
            int gas = (int) (c.cantidad * c.porcentajeGas);

            totalGasolinaVehiculos += gasolina;
            totalDieselVehiculos += diesel;
            totalGasVehiculos += gas;

            totalGasolinaEmisiones += gasolina * factorGasolina;
            totalDieselEmisiones += diesel * factorDiesel;
            totalGasEmisiones += gas * factorGas;
        }

        // Promedios globales
        double promedioGasolina = totalGasolinaEmisiones / totalGasolinaVehiculos;
        double promedioDiesel = totalDieselEmisiones / totalDieselVehiculos;
        double promedioGas = totalGasEmisiones / totalGasVehiculos;

        // Mostrar resultados
        System.out.println("📊 Promedios de emisiones por tipo de combustible:");
        System.out.printf("Gasolina: %.2f toneladas de CO₂ por vehículo\n", promedioGasolina);
        System.out.printf("Diésel: %.2f toneladas de CO₂ por vehículo\n", promedioDiesel);
        System.out.printf("Gas: %.2f toneladas de CO₂ por vehículo\n", promedioGas);
    }
}
