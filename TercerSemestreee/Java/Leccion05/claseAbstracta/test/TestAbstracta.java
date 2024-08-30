package TercerSemestreee.Java.Leccion05.claseAbstracta.test;

import TercerSemestreee.Java.Leccion05.claseAbstracta.domain.*;

public class TestAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dubujar();
    }
}
