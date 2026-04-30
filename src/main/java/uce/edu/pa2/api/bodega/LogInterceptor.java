package uce.edu.pa2.api.bodega;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Log
@Interceptor
@Priority(1)
public class LogInterceptor {

    @AroundInvoke
    public Object log(InvocationContext context) throws Exception {
        
        System.out.println("Se ejecutó el Log antes del método");
        System.out.println("Interceptado el método: " + context.getMethod().getName());
        
        Object[] args = context.getParameters();

        for (int i = 0; i<args.length; i++) {
            System.out.println("Argumento: " + args[i].getClass().getName());
            Object obj = args[i];
            Venta venta = (Venta) obj;
            System.out.println("Cliente: " + venta.getCliente());
            System.out.println("Total venta: $" + venta.getTotal());
        }

        Object resultado = context.proceed();

        return resultado;
    }

}
