package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaServiceTiempo {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;
    
    @MedirTiempo
    public void procesar(Venta venta) {

        // Inicio de la venta
        System.out.println("Procesando pedido");
        // Consultando el stock de cada item
        // Consultando en la base de datos

        // Simular tiempo de demora
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Registra estadisticas
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final del pedido");
        
    }

    @MedirTiempo
    public void reprocesar(Venta venta) {

        // Inicio de la venta
        System.out.println("Reprocesando pedido");
        // Consultando el stock de cada item
        // Consultando en la base de datos

        // Simular tiempo de demora
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Registra estadisticas
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Final del reproceso");
        
    }

}
