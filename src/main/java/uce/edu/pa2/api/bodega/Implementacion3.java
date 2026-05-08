package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class Implementacion3 implements InterfazServicio {

    @Override
    public void agregar(Clase1 clase) {

        System.out.println("--Agregando tercera cadena--");
        clase.getCadena().append("|Cadena 3|");
    }

}
