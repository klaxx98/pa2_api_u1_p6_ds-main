package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor
@Priority(2)
public class MedirTiempoInterceptor {

    @AroundInvoke
    public Object medir(InvocationContext context) throws Exception {
        
        System.out.println("Se ejecutó antes del método");
        System.out.println("Método interceptado: " + context.getMethod().getName());
        long inicio = System.currentTimeMillis();

        // Inicia la ejecución del método
        // Si no se llama al método proceed(), nunca se ejecuta el método
        // Se ejecuta primero todo lo que está por arriba de context.proceed()
        Object resultado = context.proceed();
        // Pasa a la siguiente línea una vez que se termina de ejecutar el método de negocio
        long fin = System.currentTimeMillis();
        
        long tiempoTranscurrido = fin - inicio;

        System.out.println("Tiempo transcurrido: " + tiempoTranscurrido + " ms");
        return resultado;
    }

}
