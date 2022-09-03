package clases;

import interfaz.Afip;

public class Empresa implements Afip {

    protected String nombre;
    protected Integer ingresosNetos;
    protected Integer nPersonal;
    protected Integer nSocios;
    protected String fechaFundacion;

    protected String direccion;
    protected static Integer idEmpresa = 0;

    public Empresa(String nombre, String fechaFundacion){

    }
    public Empresa(String nombre, Integer nSocios, String fechaFundacion, String direccion) {
        this.nombre = nombre;
        this.nSocios = nSocios;
        this.fechaFundacion = fechaFundacion;
        this.direccion = direccion;
        idEmpresa = idEmpresa++;
    }


    public String getNombre() {
        return nombre;
    }

    public Integer getIngresosNetos() {
        return ingresosNetos;
    }

    public void setIngresosNetos(Integer ingresosNetos) {
        this.ingresosNetos = ingresosNetos;
    }

    public Integer getnPersonal() {
        return nPersonal;
    }

    public void setnPersonal(Integer nPersonal) {
        this.nPersonal = nPersonal;
    }

    public Integer getnSocios() {
        return nSocios;
    }

    public void setnSocios(Integer nSocios) {
        this.nSocios = nSocios;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public static int getIdEmpresa() {
        return idEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", ingresosNetos=" + ingresosNetos +
                ", nPersonal=" + nPersonal +
                ", nSocios=" + nSocios +
                ", fechaFundacion='" + fechaFundacion + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
