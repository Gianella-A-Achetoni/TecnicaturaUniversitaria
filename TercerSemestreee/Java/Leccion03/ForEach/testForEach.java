package TercerSemestreee.Java.Leccion03.ForEach;

public class testForEach {
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9};
        for (int edad : edades) {//Con esto no podemos ver el indice
            System.out.println("Edad: " + edad);
        }

        Persona personas[] ={new Persona("Juan"), new Persona("Carla"),new Persona("Beatriz")};
        //ForEach
        for (Persona persona : personas) {
            System.out.println("Persona = " + persona);
        }

    }
}
