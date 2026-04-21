package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Tienda {

    private final String name = "Tienda de la Esquina"; //Nombre único de la tienda para toda la aplicación

    public String getName() {
        return name;
    }

}
