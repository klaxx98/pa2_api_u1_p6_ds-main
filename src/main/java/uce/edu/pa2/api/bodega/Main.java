package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication{

        @Inject
        private ProcesadorVentaServiceTiempo procesador;

        @Inject
        private InventarioService inventarioService;

        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;

        @Override
        public int run(String ... args) {

            Venta v1 = new Venta("David Salazar", 70.0);

            this.procesador.procesar(v1);
            System.out.println();
            this.inventarioService.registrarInventario(v1);
            System.out.println();
            this.procesador.reprocesar(v1);

            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();
            System.out.println();

            return 0;
       }
    }
}
