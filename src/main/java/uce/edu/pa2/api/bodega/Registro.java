package uce.edu.pa2.api.bodega;

import jakarta.inject.Singleton;

@Singleton
public class Registro {

    private String historial = ""; //Historial de compras, ventas y movimientos de inventario

    public String getHistorial() {
        return historial;
    }

    public void registrar(String evento) {
        this.historial += " > " + evento; //Agrega un nuevo evento al historial
    }

}
