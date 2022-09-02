package clases;

import enumerado.Color;

public class Concesionario extends Empresa {

    private Color auto;
    private Integer nAutos;

    public Concesionario(String nombre, Integer ingresosNetos, Integer nSocios, String fechaFundacion, String direccion,
                         Integer nAutos) {
        super(nombre, nSocios, fechaFundacion, direccion);
        this.nAutos = nAutos;
    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "auto=" + auto +
                ", nAutos=" + nAutos +
                ", nombre='" + nombre + '\'' +
                ", ingresosNetos=" + ingresosNetos +
                ", nPersonal=" + nPersonal +
                ", nSocios=" + nSocios +
                ", fechaFundacion='" + fechaFundacion + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
