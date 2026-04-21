package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ServicioFacturacion {

    @Inject
    ComprobantePdf pdf;
    @Inject
    ComprobanteFisico fisico;

    public void ejecutarCobro(Pedido pedido) {
        if (pedido.getDestino() != null && !pedido.getDestino().isEmpty()) {
            pdf.procesar(pedido);
        } else {
             fisico.procesar(pedido);
        }
    }

}
