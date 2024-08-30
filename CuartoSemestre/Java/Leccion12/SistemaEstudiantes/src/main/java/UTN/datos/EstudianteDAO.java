package UTN.datos;

import UTN.dominio.Estudiante;
import static UTN.conexion.Conexion.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDAO {
    public List<Estudiante> listarEstudiantes(){
        List<Estudiante> estudiantes = new ArrayList<>();
        //Creamos objetos necesarios para comunicarnos con la base de datos
        PreparedStatement ps; //Envia la sentencia
        ResultSet rs; //Obtenemos resultado

        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes.estudiantes2022 ORDER BY idestudiantes2022";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                var estudiante = new Estudiante();
                estudiante.setIdEstudiante(rs.getInt("idestudiantes2022"));
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                //agregamos a la lista
                estudiantes.add(estudiante);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error al listar datos: "+e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Ocurrio un error al cerrarse: "+e.getMessage());
            }
        }
        return estudiantes;
    }//Fin metodo Listar

    //Metodo para buscar por id >> fin by id
    public boolean buscarEstudiantePorID(Estudiante estudiante){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConnection();
        String sql = "SELECT * FROM estudiantes.estudiantes2022 WHERE idestudiantes2022=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            rs = ps.executeQuery();
            if (rs.next()) {
                estudiante.setNombre(rs.getString("nombre"));
                estudiante.setApellido(rs.getString("apellido"));
                estudiante.setTelefono(rs.getString("telefono"));
                estudiante.setEmail(rs.getString("email"));
                return true;
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error al buscar el esstudiante: "+e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Ocurrio un error al cerrarse: "+e.getMessage());
            }
        }
        return false;
    }//Fin buscar por id

    //Metodo agregar
    public boolean agregarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "INSERT INTO estudiantes.estudiantes2022 ( nombre, apellido, telefono, email) VALUES ( ?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.execute();
            return true;

        }catch (Exception e){
            System.out.println("Ocurrio un error al agregar un estudiante: "+e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Ocurrio un error al cerrarse: "+e.getMessage());
            }
        }
        return false;
    }//fin metodo agregar estudiante

    //Metodo para modificar
    public  boolean modificarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "UPDATE estudiantes.estudiantes2022 SET nombre=?, apellido=?, telefono=?, email=? WHERE idestudiantes2022=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, estudiante.getNombre());
            ps.setString(2, estudiante.getApellido());
            ps.setString(3, estudiante.getTelefono());
            ps.setString(4, estudiante.getEmail());
            ps.setInt(5, estudiante.getIdEstudiante());
            ps.execute();
            return true;

        }catch (Exception e){
            System.out.println("Ocurrio un error al modificar un estudiante: "+e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Ocurrio un error al cerrarse: "+e.getMessage());
            }
        }
        return false;
    }//fin metodo modificar

    public boolean eliminarEstudiante(Estudiante estudiante){
        PreparedStatement ps;
        Connection con = getConnection();
        String sql = "DELETE FROM estudiantes.estudiantes2022 WHERE idestudiantes2022=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, estudiante.getIdEstudiante());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Ocurrio un error al eliminar un estudiante: "+e.getMessage());
        }
        finally {
            try {
                con.close();
            }catch (Exception e){
                System.out.println("Ocurrio un error al cerrarse: "+e.getMessage());
            }
        }
        return false;
    }// cierre eliminar

//    public static void main(String[] args) {
//        var estudianteDao = new EstudianteDAO();
//        //Modificar
//       // var estudianteModificado = new Estudiante(5,"Lujan","Manzano","531121551","lmanzano@gmail.com");
//        //var modificado = estudianteDao.modificarEstudiante(estudianteModificado);
//        //if (modificado)
//          //System.out.println("Estudiante agregado: "+estudianteModificado);
//        //else
//          //System.out.println("no se encontro el estudiante: "+estudianteModificado.getIdEstudiante());
//
//        //Eliminar
//        var estudianteEliminado = new Estudiante(5);
//        var eliminado = estudianteDao.eliminarEstudiante(estudianteEliminado);
//        if (eliminado)
//            System.out.println("Estudiante eliminado: "+estudianteEliminado);
//        else
//            System.out.println("no se encontro el estudiante: "+estudianteEliminado.getIdEstudiante());
//        //Listar
//
//        System.out.println("Listado de estudiantes: ");
//        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
//        estudiantes.forEach(System.out::println);
//
//        //agregar estudiente
//        //var nuevoEstudiante = new Estudiante("Carlos", "Perez", "2415401154", "juanp@gmail.com");
//        //var agregado = estudianteDao.agregarEstudiante(nuevoEstudiante);
//        //if (agregado)
//          //  System.out.println("Estudiante agregado: "+nuevoEstudiante);
//        //else
//          //  System.out.println("no se encontro el estudiante: "+nuevoEstudiante.getIdEstudiante());
//
//
//        //Buscar por id
//        //var estudiante1 = new Estudiante(1);
//        //System.out.println("Estudiante antes de la busqueda: "+estudiante1);
//        //var encontrado = estudianteDao.buscarEstudiantePorID(estudiante1);
//        //if (encontrado)
//          //  System.out.println("Estudiante encontrado: "+estudiante1);
//        //else
//          //  System.out.println("no se encontro el estudiante: "+estudiante1.getIdEstudiante());
//    }
}
