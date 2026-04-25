package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.Dependent;

@Dependent
public class TrackingVenta {

    private long tiempoInicio = 0;
    private long tiempoFinal = 0;
    private long tiempoTotalAcumulado = 0;
    private int numeroTotalOperaciones = 0;

    public void iniciar() {
        this.tiempoInicio = System.currentTimeMillis();
    }

    public void reiniciar() {
        this.tiempoTotalAcumulado = 0;
        this.numeroTotalOperaciones = 0;
    }

    public void finalizar() {
        this.tiempoFinal = System.currentTimeMillis();
        long tiempoEjecucion = tiempoFinal - tiempoInicio;
        System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " ms");

        this.tiempoTotalAcumulado += tiempoEjecucion;
        this.numeroTotalOperaciones ++;

        System.out.println("Tiempo acumulado: " + this.tiempoTotalAcumulado + " ms");
        System.out.println("Cantidad de operaciones: " + this.numeroTotalOperaciones + "\n");
    }

}
