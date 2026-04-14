package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorSMS implements Notificador {

    @Override
    public void enviar(String telefono, String mensaje) {
        System.out.println("Se envia el SMS al telefono: " + telefono);
        System.out.println("Con el mensaje: " + mensaje);
    }

}
