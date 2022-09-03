package enumerado;

public enum TipoAuto {
    SEDAN("sedan", "auto mediano", 4),
    HATCHBACK("hatchback", "auto compacto", 4),
    PICKUP("pickup", "camioneta", 4),
    COUPE("coupe", "auto chico", 2),
    CONVERTIBLE("hatchback", "auto deportivo", 2),
    FURGON("furgon", "auto utilitario", 4);

    private final String nombre;
    private final Integer nPuertas;
    private final String descripcion;

    TipoAuto(String nombre, String descripcion, Integer nPuertas){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nPuertas = nPuertas;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getnPuertas() {
        return nPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
