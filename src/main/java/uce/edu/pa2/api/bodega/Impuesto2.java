package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Impuesto2 implements Impuesto {

    @Override
    public double aplicar(double valor) {
        double valorImpuestoDos = valor * 0.10;
        System.out.println("Aplicando Impuesto 2 por el valor de: $" + valorImpuestoDos);
        return valor + valorImpuestoDos;
    }

}
