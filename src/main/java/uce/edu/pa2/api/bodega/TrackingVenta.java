package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.Dependent;

@Dependent
public class TrackingVenta {

    private long tiempoInicio;

    private long tiempoFinal;

    public void iniciar() {
        this.tiempoInicio = System.currentTimeMillis();
    }

    public void finalizar() {
        this.tiempoFinal = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal - this.tiempoInicio;
        System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " ms");
    }

}
