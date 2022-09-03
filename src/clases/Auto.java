package clases;

import enumerado.TipoAuto;

public class Auto {

    private String color;
    private TipoAuto tipo;

    public Auto(String color,TipoAuto tipo){
        this.color = color;
        this.tipo =tipo;
    }

    public String getColor() {
        return color;
    }

    public TipoAuto getTipo() {
        return tipo;
    }
}
