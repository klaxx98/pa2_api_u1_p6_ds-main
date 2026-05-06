package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Impuesto1 implements Impuesto {

    @Override
    public double aplicar(double valor) {
        double valorImpuestoUno = valor * 0.15;
        System.out.println("Aplicando Impuesto 1 por el valor de: $" + valorImpuestoUno);
        return valor + valorImpuestoUno;

    }

}
