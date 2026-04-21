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

        /*
        @Inject
        private PedidoService service;

        @Override
        public int run(String ... args) {
            Pedido pedido = new Pedido("David Salazar", "Coca Cola", 10.0, "dasalazari@uce.edu.ec", "0987654321");
            this.service.registrar(pedido);
            return 0;
        }
        */

       @Inject
       private AmbitoAplicacion ambitoAplicacion;

       @Inject
       private ClaseIntermedia claseIntermedia;

       //@Inject
       //private AmbitoRequest ambitoRequest;

       @Inject
       private AmbitoInject ambitoInject;

       @Inject
       private AmbitoSingleton ambitoSingleton;

       @Override
       public int run(String ... args) {

       /*
       // CASO 1: Tiene destino registrado -> Debería generar factura PDF
            System.out.println("\n--- PRUEBA 1: CLIENTE CON EMAIL ---");
            Pedido pedido1 = new Pedido("David Salazar", "PC", 1200, "dasalazari@uce.edu.ec");
            pedidoService.registrar(pedido1, pagoe);

            // CASO 2: NO tiene destino (null) -> Debería generar comprobante FÍSICO
            System.out.println("\n--- PRUEBA 2: CLIENTE SIN EMAIL ---");
            // Pasamos null en el destino para activar la lógica de comprobante físico
            Pedido pedido2 = new Pedido("David Salazar", "Teclado", 80, null);
            pedidoService.registrar(pedido2, pagoc);

            // CASO 3: Tiene destino pero es una cadena vacía "" -> Debería generar comprobante FÍSICO
            System.out.println("\n--- PRUEBA 3: CLIENTE CON EMAIL VACÍO ---");
            Pedido pedido3 = new Pedido("David Salazar", "Mouse", 40, "");
            pedidoService.registrar(pedido3, pagoe);
       */

           System.out.println(this.ambitoAplicacion.incrementar());
           System.out.println(this.ambitoAplicacion.incrementar());
           System.out.println(this.ambitoAplicacion.incrementar());
        
           this.claseIntermedia.imprimirObjetoValor();

           /*
           System.out.println("***AMBITO REQUEST***");
           ambitoRequest.incrementar();
           System.out.println(this.ambitoRequest.incrementar());
           System.out.println(this.ambitoRequest.incrementar());
           System.out.println(this.ambitoRequest.incrementar());
           */

           System.out.println("***AMBITO DEPENDENT***");
           System.out.println(this.ambitoInject.incrementar());
           System.out.println(this.ambitoInject.incrementar());
           System.out.println(this.ambitoInject.incrementar());

           this.claseIntermedia.imprimirValorInject(); //Es un objeto nuevo

           System.out.println("***AMBITO SINGLETON***");
           System.out.println(this.ambitoSingleton.incrementar());
           System.out.println(this.ambitoSingleton.incrementar());
           System.out.println(this.ambitoSingleton.incrementar());

           this.claseIntermedia.imprimirValorSingleton(); //Es el mismo objeto

           return 0;
       }
    }

}
