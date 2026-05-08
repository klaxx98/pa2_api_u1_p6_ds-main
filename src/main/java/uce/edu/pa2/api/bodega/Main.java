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
        private ProcesadorImplementacionService implementacionService;

        @Override
        public int run(String ... args) {

            Clase1 clase = new Clase1("Clase 1", new StringBuilder());
            this.implementacionService.agregarCadena(clase);

            System.out.println("Nombre: " + clase.getNombre());
            System.out.println("Cadena :" + clase.getCadena().toString());

            return 0;
       }
    }
}
