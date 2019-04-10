package concesionario;

public class Automovil extends Vehiculo {

    private int puertas;

    public Automovil() {
    }

    public Automovil(int puertas) {
        this.puertas = puertas;
    }

    public Automovil(int puertas, String MARCA, String MODELO, double PRECIO) {
        super(MARCA, MODELO, PRECIO);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Marca: " + getMARCA() + " // Modelo: " + getMODELO() + " // Puertas: " + getPuertas() + " // Precio: " + getPrecioConFormatoMoneda();
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

}
