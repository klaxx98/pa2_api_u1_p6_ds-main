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
        private ProcesadorCompraService compraService;

        @Override
        public int run(String ... args) {

            Compra compra1 = new Compra("David Salazar", 100.0, 0.0);
            this.compraService.procesar(compra1);

            return 0;
       }
    }
}
