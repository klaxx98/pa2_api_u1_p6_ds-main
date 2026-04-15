package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificadorWhatsApp implements Notificador {
    
    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Se envia un whatsapp al telefono: " + destino);
        System.out.println("Con el mensaje es: " + mensaje);
    }

}
