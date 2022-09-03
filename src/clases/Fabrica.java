package clases;

import static enumerado.Color.ROJO;

public class Fabrica extends Empresa{

    private Integer nAutosFabricados;

    private Integer nPiezas;
    private Boolean chasis = false;
    private Boolean motor = false;
    private Boolean ruedas = false;
    private Boolean transmision = false;
    private Boolean accesorioSeguridad = false;
    private Boolean luces = false;

    public Fabrica(String nombre, String fechaFundacion) {
        super(nombre, fechaFundacion);
    }

    public Fabrica(String nombre, Integer nSocios, String fechaFundacion, String direccion, Integer nAutosFabricados) {
        super(nombre, nSocios, fechaFundacion, direccion);
        this.nAutosFabricados = nAutosFabricados;
    }

    public void comprarTodasLasPiezas(){
        chasis = true;
        motor = true;
        ruedas = true;
        transmision = true;
        accesorioSeguridad = true;
        luces = true;
        nPiezas = nPiezas + 6;
    }
    public void comprarChasis(){
        chasis = true;
    }
    public void comprarMotor(){
        motor = true;
    }
    public void comprarRuedas(){
        ruedas = true;
    }
    public void comprarTransmision(){
        transmision = true;
    }
    public void comprarAccesorioSeguridad(){
        accesorioSeguridad = true;
    }
    public void comprarLuces(){
        luces = true;
    }
    public Boolean verificarPiezas(){
        if(chasis.equals(true) && motor.equals(true) && ruedas.equals(true) && transmision.equals(true) && accesorioSeguridad.equals(true) && luces.equals(true)){
            return true;
        }else{
            return false;
        }
    }
    public Auto fabricarAuto(){
        if(verificarPiezas() == true){
            nAutosFabricados++;
            Auto auto = new Auto(ROJO.getColor());
            nPiezas = nPiezas - 6;
            return auto;
        }else{return null;}
    }

    @Override
    public String toString() {
        return "Fabrica{" +
                "nAutosFabricados=" + nAutosFabricados +
                ", nPiezas=" + nPiezas +
                ", nombre='" + nombre + '\'' +
                ", ingresosNetos=" + ingresosNetos +
                ", nPersonal=" + nPersonal +
                ", nSocios=" + nSocios +
                ", fechaFundacion='" + fechaFundacion + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
