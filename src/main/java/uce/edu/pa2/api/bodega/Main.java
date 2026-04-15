package uce.edu.pa2.api.bodega;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String[] args) {

        /*
        SeContainer container = SeContainerInitializer.newInstance().initialize();

        PedidoService service = container.select(PedidoService.class).get();

        Pedido pedido = new Pedido("David Salazar", "Coca Cola", 10.0, "dasalazari@uce.edu.ec");

        service.registrar(pedido);

        container.close();
        */

        Quarkus.run(App.class, args);
        //CAPTURA GUARDADA EN /resources
    }

    public static class App implements QuarkusApplication{

        @Inject
        private PedidoService service;

        @Override
        public int run(String ... args) {
            
            //CASO 1
            Pedido pedido = new Pedido("David Salazar", "Coca Cola", 75.0, "dasalazari@uce.edu.ec", "0987654321");
            this.service.registrar(pedido);
            
            //CASO 2
            Pedido pedido2 = new Pedido("David Salazar", "Coca Cola", 120.0, "dasalazari@uce.edu.ec", "0987654321");
            this.service.registrar(pedido2);

            //CASO 3
            Pedido pedido3 = new Pedido("David Salazar", "Coca Cola", 30.0, "dasalazari@uce.edu.ec", "0987654321");
            this.service.registrar(pedido3);

            return 0;
        }
    }

}
