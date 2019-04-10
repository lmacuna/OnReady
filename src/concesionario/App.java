package concesionario;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Vehiculo[] arrayVehiculos = new Vehiculo[4];
        arrayVehiculos[0] = new Automovil(4, "Peugeot", "206", 200000);
        arrayVehiculos[1] = new Moto(125, "Honda", "Titan", 60000);
        arrayVehiculos[2] = new Automovil(5, "Peugeot", "208", 250000);
        arrayVehiculos[3] = new Moto(160, "Yamaha", "YBR", 80500.5);

        imprimirVehiculos(arrayVehiculos);

        Vehiculo vehiculoMasCaro = getVehiculoMasCaro(arrayVehiculos);
        Vehiculo vehiculoMasBarato = getVehiculoMasBarato(arrayVehiculos);

        imprimir("=============================");

        imprimir("Vehiculo mas caro: " + vehiculoMasCaro.getMARCA() + " " + vehiculoMasCaro.getMODELO());
        imprimir("Vehiculo mas barato: " + vehiculoMasBarato.getMARCA() + " " + vehiculoMasBarato.getMODELO());

        char letraParaBuscarEnModelosDeVehiculos = 'Y';
        Vehiculo vehiculoEncontradoConLetra = getPrimerVehiculoConLetraEnModelo(arrayVehiculos, letraParaBuscarEnModelosDeVehiculos);
        imprimir("Vehículo que contiene en el modelo la letra: '" + letraParaBuscarEnModelosDeVehiculos + "': " + vehiculoEncontradoConLetra.getMARCA() + " " + vehiculoEncontradoConLetra.getMODELO() + " " + vehiculoEncontradoConLetra.getPrecioConFormatoMoneda());

        imprimir("=============================");

        imprimir("Vehículos ordenados por precio de mayor a menor:");
        arrayVehiculos = ordenarVehiculosPorPrecio(arrayVehiculos);
        for (int i = 0; i < arrayVehiculos.length; i++) {
            imprimir(arrayVehiculos[i].getMARCA() + " " + arrayVehiculos[i].getMODELO());
        }
    }

    public static void imprimir(String cadena) {
        System.out.println(cadena);
    }

    public static void imprimirVehiculos(Vehiculo[] vehiculos) {
        for (int i = 0; i < vehiculos.length; i++) {
            imprimir(vehiculos[i].toString());
        }
    }

    public static Vehiculo getVehiculoMasCaro(Vehiculo[] vehiculos) {
        double precioMaximo = 0;
        int indexPrecioMaximo = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i].getPRECIO() > precioMaximo) {
                precioMaximo = vehiculos[i].getPRECIO();
                indexPrecioMaximo = i;
            }
        }
        return vehiculos[indexPrecioMaximo];
    }

    public static Vehiculo getVehiculoMasBarato(Vehiculo[] vehiculos) {
        double precioMinimo = vehiculos[0].getPRECIO();
        int indexPrecioMinimo = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i].getPRECIO() < precioMinimo) {
                precioMinimo = vehiculos[i].getPRECIO();
                indexPrecioMinimo = i;
            }
        }
        return vehiculos[indexPrecioMinimo];
    }

    public static Vehiculo getPrimerVehiculoConLetraEnModelo(Vehiculo[] vehiculos, char letra) {
        for (int i = 0; i < vehiculos.length; i++) {
            String modeloBuscando = vehiculos[i].getMODELO().toUpperCase();
            int index = modeloBuscando.indexOf(letra);
            if (index >= 0) {
                return vehiculos[i];
            }
        }
        return new Vehiculo();
    }

    public static Vehiculo[] ordenarVehiculosPorPrecio(Vehiculo[] vehiculos) {
        Arrays.sort(vehiculos, new Vehiculo());
        return vehiculos;
    }

}
