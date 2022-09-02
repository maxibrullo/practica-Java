package test;

import clases.Concesionario;
import clases.Empresa;
import clases.Fabrica;

public class Test {
    public static void main(String[] args) {
        Empresa empresa1 = new Concesionario("Chrisley", 10978153, 14,
                "05/06/1885", "Bv San Juan", 6);
        imprimir(empresa1);
        System.out.println();
        Empresa empresa2 = new Fabrica("Chrisley", 5, "02/09/1996",
                "Mariano Moreno", 10659);
        imprimir(empresa2);
    }
    public static void imprimir(Empresa empresa){
        System.out.print(empresa.toString());
    }
}
