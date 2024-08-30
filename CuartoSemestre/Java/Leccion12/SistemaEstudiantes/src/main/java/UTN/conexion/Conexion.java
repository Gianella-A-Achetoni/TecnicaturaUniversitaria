package UTN.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection getConnection(){
        Connection conexion = null;
        //variables para iniciar
        var baseDeDatos = "estudiantes";
        var url = "jdbc:mysql://localhost:3306/"+baseDeDatos;
        var usuario = "root";
        var password = "Ga142536475869";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url,usuario,password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ocurrio un error en la conexion: "+e.getMessage());
        }
        return conexion;
    }
}
