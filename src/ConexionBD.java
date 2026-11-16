public class ConexionBD {
    private static ConexionBD instancia;
    private String estado;

    private ConexionBD() {
        this.estado = "Conectado";
        System.out.println("Abriendo conexión física única...");
    }

    public static ConexionBD getInstancia() {
        if (instancia == null) {
            instancia = new ConexionBD();
        }
        return instancia;
    }

    public void consultar(String query) {
        System.out.println("Ejecutando consulta: " + query);
    }

    public void actualizar(String update) {
        System.out.println("Ejecutando actualización: " + update);
    }

    public String getEstado() {
        return estado;
    }
}