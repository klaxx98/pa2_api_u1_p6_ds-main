package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class Implementacion2 implements InterfazServicio {

    @Override
    public void agregar(Clase1 clase) {

        System.out.println("--Agregando segunda cadena--");
        clase.getCadena().append("|Cadena 2|");
    }

}
