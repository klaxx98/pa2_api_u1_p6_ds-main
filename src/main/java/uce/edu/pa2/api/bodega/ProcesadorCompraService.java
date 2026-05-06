package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorCompraService {

    @Inject
    private Instance<Descuento> descuentos; // Detecta todas las implementaciones del sistema
                                            // Una lista de implementaciones
    @Inject
    private Instance<Impuesto> impuestos;

    public void procesar(Compra compra) {

        double total = compra.getSubtotal();

        for (Descuento des : descuentos) {
            total = des.aplicar(total);
        }

        for (Impuesto imp : impuestos) {
            total = imp.aplicar(total);
        }
        
        compra.setTotal(total);

        System.out.println("\nSu valor a pagar es: " + compra.getTotal());

    }

}
