package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Impuesto3 implements Impuesto {

    @Override
    public double aplicar(double valor) {
        double valorImpuestoTres = valor * 0.08;
        System.out.println("Aplicando Impuesto 3 por el valor de: $" + valorImpuestoTres);
        return valor + valorImpuestoTres;
    }

}
