package UTN.presentacion;

import UTN.datos.EstudianteDAO;
import UTN.dominio.Estudiante;

import java.util.List;
import java.util.Scanner;

public class SistemaEstudiantesApp {

    public void menu(){
        System.out.println(getMostrarMenu());
        Scanner op = new Scanner(System.in);
        System.out.println("Ingrese su opción: ");
        int opcion = op.nextInt();
        while (opcion != 6){
            switch (opcion) {
                case 1:
                    Listar();
                    break;
                case 2:
                    System.out.println("Ingrese el ID del estudiante que desea buscar: ");
                    int id = op.nextInt();
                    Buscar(id);
                    break;
                case 3:
                    System.out.println("Ingrese el nombre: ");
                    String nombre = op.next();
                    System.out.println("Ingrese el apellido: ");
                    String apellido = op.next();
                    System.out.println("Ingrese el telefono: ");
                    String telefono = op.next();
                    System.out.println("Ingrese el email: ");
                    String email = op.next();
                    agregar(nombre, apellido, telefono, email);
                    break;
                case 4:
                    System.out.println("Ingrese el ID del estudiante que desea modificar: ");
                    id = op.nextInt();
                    System.out.println("Ingrese el nombre: ");
                    nombre = op.next();
                    System.out.println("Ingrese el apellido: ");
                    apellido = op.next();
                    System.out.println("Ingrese el telefono: ");
                    telefono = op.next();
                    System.out.println("Ingrese el email: ");
                    email = op.next();
                    modificar(id, nombre, apellido, telefono, email);
                    break;
                case 5:
                    System.out.println("Ingrese el ID del estudiante que desea eliminar: ");
                    id = op.nextInt();
                    eliminar(id);
                    break;
            }
            System.out.println(getMostrarMenu());
            System.out.println("Ingrese su opción: ");
             opcion = op.nextInt();
        }
    }

    public String getMostrarMenu(){
        return """
                **********Menú**********
                1.Listar estudiantes
                2.Buscar estudiante
                3.Agregar estudiante
                4.Modificar estudiante
                5.Eliminar estudiante
                6.Salir
                """;
    }

    public void Listar(){
        var estudianteDao = new EstudianteDAO();
        System.out.println("Listado de estudiantes: ");
        List<Estudiante> estudiantes = estudianteDao.listarEstudiantes();
        estudiantes.forEach(System.out::println);
    }

    public void Buscar(int id){
        var estudianteDao = new EstudianteDAO();
        var estudiante1 = new Estudiante(id);
        System.out.println("Estudiante antes de la busqueda: "+estudiante1);
        var encontrado = estudianteDao.buscarEstudiantePorID(estudiante1);
        if (encontrado)
            System.out.println("Estudiante encontrado: "+estudiante1);
       else
           System.out.println("no se encontro el estudiante: "+estudiante1.getIdEstudiante());
    }

    public void modificar(int id, String nombre, String apellido, String telefono, String email ){
         var estudianteDao = new EstudianteDAO();
         var estudianteModificado = new Estudiante(id, nombre, apellido, telefono, email);
         var modificado = estudianteDao.modificarEstudiante(estudianteModificado);
         if (modificado)
           System.out.println("Estudiante agregado: "+estudianteModificado);
         else
           System.out.println("no se encontro el estudiante: "+estudianteModificado.getIdEstudiante());
    }

    public void agregar(String nombre, String apellido, String telefono, String email){
        var estudianteDao = new EstudianteDAO();
        var nuevoEstudiante = new Estudiante(nombre, apellido, telefono, email);
        var agregado = estudianteDao.agregarEstudiante(nuevoEstudiante);
        if (agregado)
            System.out.println("Estudiante agregado: "+nuevoEstudiante);
        else
            System.out.println("no se encontro el estudiante: "+nuevoEstudiante.getIdEstudiante());
    }

    public void eliminar(int id){
        var estudianteDao = new EstudianteDAO();
        var estudianteEliminado = new Estudiante(id);
        var eliminado = estudianteDao.eliminarEstudiante(estudianteEliminado);
        if (eliminado)
           System.out.println("Estudiante eliminado: "+estudianteEliminado);
        else
            System.out.println("no se encontro el estudiante: "+estudianteEliminado.getIdEstudiante());
    }

    public static void main(String[] args) {
        SistemaEstudiantesApp app = new SistemaEstudiantesApp();
        app.menu();
    }
}

