public class Main {
    public static void main(String[] args) {
        ConexionBD db1 = ConexionBD.getInstancia();
        ConexionBD db2 = ConexionBD.getInstancia();

        System.out.println("¿Es la misma conexión?: " + (db1 == db2));
        System.out.println("Estado: " + db1.getEstado());

        db1.consultar("SELECT * FROM usuarios");
        db2.actualizar("UPDATE usuarios SET activo = 1");
    }
}