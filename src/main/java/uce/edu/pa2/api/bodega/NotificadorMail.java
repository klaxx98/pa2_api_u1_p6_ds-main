package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

@ApplicationScoped
@Default
public class NotificadorMail implements Notificador {
    
    @Override
    public void enviar(String correo, String mensaje) {
        System.out.println("Se envia el mail al correo: " + correo);
        System.out.println("Con el mensaje es: " + mensaje);
    }

}
