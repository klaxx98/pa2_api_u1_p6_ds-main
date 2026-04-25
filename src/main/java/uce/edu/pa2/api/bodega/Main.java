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
        private ProcesadorVentaService procesadorVentaService;

        @Inject
        private ProcesadorVentaService1 procesadorVentaService1;

        @Inject
        private ProcesadorVentaOnlineService procesadorVentaServiceOnline;

        @Inject
        private EstadisticasVentasGlobales estadisticasVentasGlobales;

        @Override
        public int run(String ... args) {

            Venta v1 = new Venta("David Salazar", 70.0);
            Venta v2 = new Venta("Cliente 2", 40.0);
            Venta v3 = new Venta("Cliente 3", 20.0);
            Venta v4 = new Venta("Cliente 4", 20.0);
            Venta v5 = new Venta("Cliente 4", 20.0);

            this.procesadorVentaService.procesar(v1);
            this.procesadorVentaService.procesar(v2);
            this.procesadorVentaService.procesar(v3);
            this.procesadorVentaService1.procesar(v4);
            this.procesadorVentaService1.procesar(v5);
            this.procesadorVentaServiceOnline.procesar(v3);
            this.procesadorVentaServiceOnline.procesar(v4);
            this.procesadorVentaServiceOnline.procesar(v5);

            this.estadisticasVentasGlobales.mostrarEstadisticasGlobales();
            System.out.println();

            return 0;
       }
    }
}
