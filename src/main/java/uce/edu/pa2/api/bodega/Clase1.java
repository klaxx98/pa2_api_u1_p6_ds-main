package uce.edu.pa2.api.bodega;

public class Clase1 {

    private String nombre;
    private StringBuilder cadena;

    public Clase1() {
    }

    public Clase1(String nombre, StringBuilder sb) {
        this.nombre = nombre;
        this.cadena = sb;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public StringBuilder getCadena() {
        return cadena;
    }

    public void setCadena(StringBuilder sb) {
        this.cadena = sb;
    }

}
