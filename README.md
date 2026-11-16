Ejercicio 2 - Gestor de Conexiones a Base de Datos Simple

Explicación del programa

En este ejercicio se creó una clase llamada ConexionBD que aplica el patrón Singleton para garantizar una única conexión a la base de datos en toda la aplicación.
La clase cuenta con:
- Una variable estática privada llamada instancia.
- Un atributo privado llamado estado.
- Un constructor privado que simula la apertura inicial de la conexión para evitar múltiples accesos costosos.
- Un método estático público llamado getInstancia() que devuelve siempre la misma instancia.
- Métodos públicos consultar() y actualizar() para operar utilizando la conexión activa.

Luego, dentro del método main, se obtienen dos referencias al gestor:
ConexionBD db1 = ConexionBD.getInstancia();
ConexionBD db2 = ConexionBD.getInstancia();

Finalmente, se utilizó System.out.println() para comprobar que ambas referencias apuntan al mismo objeto y para ejecutar operaciones de consulta y actualización por consola.

Lógica utilizada

La lógica del programa consiste en:
- Bloquear la creación de múltiples objetos utilizando un constructor privado.
- Controlar mediante getInstancia() que la conexión se abra una sola vez y se mantenga sincronizada.
- Invocar operaciones de lectura y modificación utilizando la misma referencia global en todo el sistema.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
Abriendo conexión física única...
¿Es la misma conexión?: true
Estado: Conectado
Ejecutando consulta: SELECT * FROM usuarios
Ejecutando actualización: UPDATE usuarios SET activo = 1

Captura de pantalla

<img width="766" height="217" alt="image" src="https://github.com/user-attachments/assets/708a1ff2-df4a-40ff-9a15-23881a75bf8e" />
