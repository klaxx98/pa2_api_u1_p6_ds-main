package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class Cajero {

    @Inject
    Tienda tienda;
    @Inject
    Registro registro;
    @Inject
    Ticket ticket;

    public void atender() {
        System.out.println("Bienvenido a la " + tienda.getName() + "!");
        System.out.println("Generando ticket...");
        System.out.println(ticket.verTicket());
        registro.registrar("Se atendió al cliente con " + ticket.verTicket());

    }

}
