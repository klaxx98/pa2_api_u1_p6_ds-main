package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorCompraService {

    @Inject
    private Instance<Descuento> descuentos; // Detecta todas las implementaciones del sistema
                                            // Una lista de implementaciones
    
    public void procesar(Compra compra) {

        double total = compra.getSubtotal();

        for (Descuento des : descuentos) {
            total = des.aplicar(total);
        }
        
        compra.setTotal(total);

        System.out.println("Su valor a pagar es: " + compra.getTotal());

    }

}
