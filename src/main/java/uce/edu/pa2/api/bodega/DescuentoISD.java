package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(3)
public class DescuentoISD implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando ISD");
        double valorISD = valor * 0.10;
        return valor - valorISD;
    }

}
