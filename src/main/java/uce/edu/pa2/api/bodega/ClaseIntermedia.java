package uce.edu.pa2.api.bodega;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClaseIntermedia {

    @Inject
    private AmbitoAplicacion ambitoAplicacion;

    @Inject
    private AmbitoInject ambitoInject;

    @Inject
    private AmbitoSingleton ambitoSingleton;

    public void imprimirObjetoValor() {
        System.out.println(this.ambitoAplicacion);
        System.out.println(this.ambitoAplicacion.incrementar());
    }

    public void imprimirValorInject() {
        System.out.println(this.ambitoInject);
        System.out.println(this.ambitoInject.incrementar());
    }

    public void imprimirValorSingleton() {
        System.out.println(this.ambitoSingleton);
        System.out.println(this.ambitoSingleton.incrementar());
    }

}
