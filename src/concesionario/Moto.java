package concesionario;

public class Moto extends Vehiculo {

    private int cilindrada;

    public Moto() {
    }

    public Moto(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public Moto(int cilindrada, String MARCA, String MODELO, double PRECIO) {
        super(MARCA, MODELO, PRECIO);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: " + getMARCA() + " // Modelo: " + getMODELO() + " // Cilindrada: " + getCilindrada() + "c // Precio: " + getPrecioConFormatoMoneda();
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
