package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ComprobanteSelector {

    @Inject
    ComprobanteFisico fisico;

    @Inject
    ComprobantePdf pdf;

    public GeneradorComprobante seleccionar(String destino) {
        // Lógica: Si hay email, PDF. Si no, Físico
        if (destino != null && !destino.isEmpty()) {
            return pdf;
        }
        return fisico;
    }
}
