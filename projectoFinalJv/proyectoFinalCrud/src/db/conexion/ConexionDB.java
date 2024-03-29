package db.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {
    private static Connection conexion;
    private static String user = "usuary";
    private static String pass = "pass";
    private static String db = "empleados";
    private static int port = 3306;
    private static String url = "jdbc:mysql://localhost:" + port + "/" + db;

    private ConexionDB() {
        // Constructor privado patrón singleton
    }

    public static Connection obtenerConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, pass);
            return conexion;
        } catch (Exception ex) {
            System.out.println("Error al conectar la base de datos");
        }
        return null;
    }

    public static void cerrarConexion(Connection conexion) {
        try {
            if (conexion == null || conexion.isClosed()) return;
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error al cerrar la conexión");
        }
    }
}
