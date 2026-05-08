package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesadorImplementacionService {

    @Inject
    private Instance<InterfazServicio> implementaciones;

    public void agregarCadena(Clase1 clase) {

        for (InterfazServicio iS : implementaciones) {
            iS.agregar(clase);
        }

    }

}
