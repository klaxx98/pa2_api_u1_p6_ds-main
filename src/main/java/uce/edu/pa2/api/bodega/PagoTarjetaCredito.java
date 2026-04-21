package uce.edu.pa2.api.bodega;

public class PagoTarjetaCredito implements PagoEstrategia {

    @Override
    public void realizar(double valor) {
        System.out.println("Presenta una pantalla");
        System.out.println("Cobro realizado");
    }

}
