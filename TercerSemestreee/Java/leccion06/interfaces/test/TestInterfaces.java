package TercerSemestreee.Java.leccion06.interfaces.test;

import TercerSemestreee.Java.leccion06.interfaces.accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySQL();
        //datos.insertar();
        //imprimir(datos);
        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
