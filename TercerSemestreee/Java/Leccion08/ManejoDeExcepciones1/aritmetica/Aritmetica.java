package TercerSemestreee.Java.Leccion08.ManejoDeExcepciones1.aritmetica;


import TercerSemestreee.Java.Leccion08.ManejoDeExcepciones1.Excepciones.OperacionExcepcion;

public class Aritmetica {
    public static int division(int numerador, int denominador){
        if (denominador == 0) {
            throw new OperacionExcepcion("Division entre cero");
        }
        return numerador / denominador;
    } 
}
