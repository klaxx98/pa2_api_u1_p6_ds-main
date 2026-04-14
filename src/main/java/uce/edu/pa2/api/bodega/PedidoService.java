package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PedidoService {
    
    //DI por constructor
    /*
    @Inject
    public PedidoService(NotificadorMail notificadorMail) {
        this.notificadorMail = notificadorMail;
    }
    */
    
    //DI por atributo
    /*
    @Inject 
    private NotificadorMail notificadorMail;
    */

    //DI por metodo
    /*
    private NotificadorMail notificadorMail;
    private NotificadorSMS notificadorSMS;

    @Inject
    public void NotificadorMail(NotificadorMail notificadorMail) {
        this.notificadorMail = notificadorMail;
    }

    @Inject
    public void NotificadorSMS(NotificadorSMS notificadorSMS) {
        this.notificadorSMS = notificadorSMS;
    }
    */

    @Inject
    private NotificadorSelector selector;

    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        //NotificadorMail n1 = new NotificadorMail(); SIN DI
        //CON DI por el container
        //notificadorMail.enviar(pedido.getCorreo(), "Se ha creado un pedido para ser atendido");

        Notificador notificador = this.selector.seleccionar(pedido.getTotal());
        notificador.enviar(pedido.getDestino(), " Pedido registrado");

        /*
        if (pedido.getTotal() > 100) {
            // Enviar un email al cliente
            notificadorMail.enviar(pedido.getDestino(), " Se ha creado un pedido para ser atendido");
        } else {
            // Enviar un SMS al cliente
            notificadorSMS.enviar(pedido.getTelefono(), " Su pedido ha sido registrado");
        }
        */

    }

}
