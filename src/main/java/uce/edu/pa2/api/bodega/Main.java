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
        private AmbitoAplicacion ambitoAplicacion;

        @Inject
        private ClaseIntermedia claseIntermedia;

        @Inject
        private AmbitoInject ambitoInject;

        @Inject
        private AmbitoSingleton ambitoSingleton;

        @Override
        public int run(String ... args) {

        System.out.println(this.ambitoAplicacion.incrementar());
        System.out.println(this.ambitoAplicacion.incrementar());
        System.out.println(this.ambitoAplicacion.incrementar());
            
        this.claseIntermedia.imprimirObjetoValor();

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
