package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class DescuentoEspecial implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando Descuento Especial");
        double valorEspecial = valor * 0.05;
        return valor - valorEspecial;
    }

}
