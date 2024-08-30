package TercerSemestreee.Java.Leccion07.JavaBeans.test;

import TercerSemestreee.Java.Leccion07.JavaBeans.domain.Persona;

public class testJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: "+ persona.getNombre());
        System.out.println("Persona apellido: "+ persona.getApellido());   
    }
}