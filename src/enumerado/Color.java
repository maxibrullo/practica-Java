package enumerado;

public enum Color {

    ROJO("rojo perlado"),
    AZUL("azul marino"),
    NEGRO("negro mate"),
    BLANCO("blanco hielo"),
    GRIS("gris topo");

    private final String color;

    Color(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
