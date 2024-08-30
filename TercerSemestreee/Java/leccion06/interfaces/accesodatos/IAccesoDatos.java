package TercerSemestreee.Java.leccion06.interfaces.accesodatos;

public interface IAccesoDatos {
    int MAX_INTERFAZ = 10;

    //Método insertar es abstracto y sin cuerpo
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
