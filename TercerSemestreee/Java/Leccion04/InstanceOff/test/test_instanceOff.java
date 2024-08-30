package TercerSemestreee.Java.Leccion04.InstanceOff.test;

import TercerSemestreee.Java.Leccion04.InstanceOff.domain.*;

public class test_instanceOff {
    public static void main(String[] args) {
        Empleado1 empleado = new Empleado1("Juan", 80000);
        determinarTipo(empleado);
        empleado = new Gerente1("Alejantro", 50000, "Sistemas");
        determinarTipo(empleado);
    }


    public static void determinarTipo(Empleado1 empleado){
        if (empleado instanceof Gerente1) {
            System.out.println("Es de tipo Gerente");
            //((Gerente1)empleado).getDepartamento();
            Gerente1 gerente = (Gerente1)empleado;
            System.out.println("Departamento: "+gerente.getDepartamento());
        }else if (empleado instanceof Empleado1) {
            System.out.println("Es de tipo Empleado");
        }else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
        }
    }

}
