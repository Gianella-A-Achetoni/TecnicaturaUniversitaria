package TercerSemestreee.Java.Leccion04.Sobreescritura.test;

import TercerSemestreee.Java.Leccion04.Sobreescritura.domain.*;

public class test_sobreescritura {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 80000);
        imprimir(empleado1);
        //System.out.println("Empleado1: " + empleado1.obtenerDetalle());
        empleado1 = new Gerente("Alejantro", 50000, "Sistemas");
        imprimir(empleado1);
        //System.out.println("Gerente1 = " + gerente1.obtenerDetalle());
    }

    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalle();
        System.out.println("Detalles: "+ detalles);
    }

}
