package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(4)
public class DescuentoIVA implements Descuento {

    @Override
    public double aplicar(double valor) {
        System.out.println("Aplicando IVA");
        double valorIVA = valor * 0.15;
        return valor - valorIVA;
    }

}
