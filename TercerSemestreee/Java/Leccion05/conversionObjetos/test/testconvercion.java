package TercerSemestreee.Java.Leccion05.conversionObjetos.test;

import TercerSemestreee.Java.Leccion05.conversionObjetos.domain.*;

public class testconvercion {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Jorge", 600000, TipoEscritura.CLASICO);
        //System.out.println("Escritor: " + empleado);
        //System.out.println(empleado.obtenerDetalles());
        Escritor escritor = (Escritor)empleado;
        escritor.getTipoEscritura();

        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());



    }
}
