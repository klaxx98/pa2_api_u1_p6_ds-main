package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class InventarioService {

    @Inject
    private EstadisticasVentasGlobales estadisticasVentasGlobales;

    @MedirTiempo
    public void registrarInventario(Venta venta) {
        System.out.println("Registrando en el inventario");

        // Simular tiempo de demora
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        // Registra estadisticas
        this.estadisticasVentasGlobales.registrarVenta(venta.getTotal());
        System.out.println("Se finalizó el registro en el inventario");
    }

}
