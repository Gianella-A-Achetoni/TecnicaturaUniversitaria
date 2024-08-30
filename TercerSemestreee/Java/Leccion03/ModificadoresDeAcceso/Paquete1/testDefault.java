package TercerSemestreee.Java.Leccion03.ModificadoresDeAcceso.Paquete1;

import TercerSemestreee.Java.Leccion03.ModificadoresDeAcceso.Paquete2.Clase4;

public class testDefault {
    public static void main(String[] args) {
        ClaseHija2 claseH2 = new ClaseHija2();
        claseH2.atributoDefault = "Cambio desde la clase prueba";
        System.out.println("ClaseHija2" + claseH2.atributoDefault);


        Clase4 clase4 = new Clase4("publico");
        System.out.println(clase4.getAtributoPrivate());
        clase4.setAtributoPrivate("Cambio");
        System.out.println("Clase4 = " + clase4.getAtributoPrivate());


    }
}
