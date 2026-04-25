package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorVentaOnlineService {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;
    
    @Inject // Como se inyecta TrackingVenta se crea un objeto
    private TrackingVenta trackingVenta;
    
    public void procesar(Venta venta) {

        trackingVenta.iniciar();

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
        
        // Finaliza la venta
        this.trackingVenta.finalizar();

        // Registra estadisticas
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());

    }

}
