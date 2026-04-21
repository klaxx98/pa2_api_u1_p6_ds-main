package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ComprobanteFisico implements GeneradorComprobante {

    @Override
    public void procesar(Pedido pedido) {
        System.out.println("[SISTEMA IMPRESION] Generando ticket fisico para el cliente");
    }

}
