package TercerSemestreee.Java.Leccion08.ManejoDeExcepciones1.test;

import TercerSemestreee.Java.Leccion08.ManejoDeExcepciones1.Excepciones.OperacionExcepcion;
import TercerSemestreee.Java.Leccion08.ManejoDeExcepciones1.aritmetica.Aritmetica;

public class testExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = Aritmetica.division(10, 0);
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se revisó la división entre cero");
        }
        System.out.println("La variable resultado tiene valor: " + resultado);
    }
}
