package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServicioComprobante {
    public void generar(Pedido pedido) {
        System.out.println("---Procesando comprobante---");

        //Logica: si el mail (destino) es nulo o  vacio, es fisico.
        if (pedido.getDestino() != null && !pedido.getDestino().isEmpty()) {
            System.out.println("Generando comprobante digital para " + pedido.getDestino());
        } else {
            System.out.println("Generando comprobante fisico para " + pedido.getCliente());
            System.out.println("Generando comprobante impreso");
        }
    }
}
