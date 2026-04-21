package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.Dependent;

@Dependent
public class Ticket {

    private double id = Math.random(); //ID único para cada ticket, generado aleatoriamente

    public String verTicket () {
        return "Ticket #" + String.format("%.4f", id);
    }

}
