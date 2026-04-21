package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    Tienda tienda;
    @Inject
    Cajero cajero;
    @Inject
    Registro registro;
    @Inject
    Ticket ticket;    

    @Override
    public int run(String... args) {
        //Inicio de la aplicación
        System.out.println("\nTienda: " + tienda.getName());
        System.out.println("Ticket: " + ticket.verTicket() + "\n");
        registro.registrar("Se inició la aplicación con " + ticket.verTicket());

        //Simulación de atención al cliente
        cajero.atender();

        //Revisión del historial de eventos
        System.out.println("\n***Revisión del historial de eventos***");
        System.out.println("Eventos registrados: " + registro.getHistorial());
        System.out.println();

        return 0;
    }

    public static void main(String... args) {
        Quarkus.run(Main.class, args);

    }

}