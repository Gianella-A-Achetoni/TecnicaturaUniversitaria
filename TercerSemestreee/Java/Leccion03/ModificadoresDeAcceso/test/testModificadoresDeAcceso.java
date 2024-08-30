package TercerSemestreee.Java.Leccion03.ModificadoresDeAcceso.test;

import TercerSemestreee.Java.Leccion03.ModificadoresDeAcceso.Paquete1.Clase1;
import TercerSemestreee.Java.Leccion03.ModificadoresDeAcceso.Paquete2.Clase3;

public class testModificadoresDeAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("Clase1 = " + clase1.atributoPublico);
        clase1.metodoPublic();

        Clase3 claseHija = new Clase3();
        System.out.println("Clase hija = " + claseHija);
    }
}
