package concesionario;

import java.text.NumberFormat;
import java.util.Comparator;
import java.util.Locale;

public class Vehiculo implements Comparator<Vehiculo> {

    private String MARCA;
    private String MODELO;
    private double PRECIO;

    public Vehiculo() {
    }

    public Vehiculo(String MARCA, String MODELO, double PRECIO) {
        this.MARCA = MARCA;
        this.MODELO = MODELO;
        this.PRECIO = PRECIO;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "MARCA=" + getMARCA() + ", MODELO=" + getMODELO() + ", PRECIO=" + getPrecioConFormatoMoneda() + '}';
    }

    public String getMARCA() {
        return MARCA;
    }

    public void setMARCA(String MARCA) {
        this.MARCA = MARCA;
    }

    public String getMODELO() {
        return MODELO;
    }

    public void setMODELO(String MODELO) {
        this.MODELO = MODELO;
    }

    public double getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(double PRECIO) {
        this.PRECIO = PRECIO;
    }

    public String getPrecioConFormatoMoneda() {
        NumberFormat formato = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("es-AR"));
        String numeroMoneda = formato.format(PRECIO);
        return numeroMoneda;
    }

    @Override
    public int compare(Vehiculo a, Vehiculo b) {
        if (a.getPRECIO() > b.getPRECIO()) {
            return -1;
        } else if (a.getPRECIO() == b.getPRECIO()) {
            return 0;
        } else {
            return 1;
        }
    }

}
