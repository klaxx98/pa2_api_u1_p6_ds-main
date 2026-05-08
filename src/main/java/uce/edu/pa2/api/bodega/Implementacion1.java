package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(3)
public class Implementacion1 implements InterfazServicio {

    @Override
    public void agregar(Clase1 clase) {
        System.out.println("--Agregando primera cadena--");
        clase.getCadena().append("|CADENA 1|");
        
    }

}
