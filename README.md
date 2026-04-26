## Casos de Uso: Ámbitos de CDI (Scopes)

A continuación se detallan 7 casos de uso reales para los ámbitos `@ApplicationScoped`, `@Dependent` y `@Singleton` dentro del desarrollo de software con Jakarta EE / Quarkus.

| # | @ApplicationScoped (Estado Compartido) | @Dependent (Ciclo de vida del padre) | @Singleton (Instancia Única Directa) |
|---|---------------------------------------|--------------------------------------|------------------------------------|
| 1 | Servicio de Registro de Pedidos       | Tracking de tiempos de transacción   | Caché de parámetros de arranque    |
| 2 | Repositorio de persistencia (DAO)     | Formateadores de fecha específicos   | Gestor de colas de mensajes local  |
| 3 | Cliente de conexión a base de datos   | Validadores de entrada de datos      | Pool de hilos del sistema          |
| 4 | Servicio de autenticación JWT         | Generadores de IDs temporales        | Contador de visitas global         |
| 5 | Gestor de configuración dinámica      | Loggers específicos por clase        | Registro de métricas del sistema   |
| 6 | Servicio de envío de correos          | Conversores de tipos (DTO a Entity)  | Orquestador de tareas programadas  |
| 7 | Controlador de inventario central     | Interceptores de auditoría           | Guardián de estados de emergencia  |

El archivo `README.md` ya existía en el proyecto en GitHub, solo fue necesario editarlo.
De no existir solo se debía crear un nuevo archivo con ese nombre y hacer el commit con los cambios realizados en el mismo.
