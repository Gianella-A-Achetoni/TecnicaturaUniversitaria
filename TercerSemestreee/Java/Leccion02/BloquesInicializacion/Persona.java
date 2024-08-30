package TercerSemestreee.Java.Leccion02.BloquesInicializacion;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    static{//Bloque de inicializacion estatico
        System.out.println("Ejecucion del bloque estatico");
        ++Persona.contadorPersona;
        //IdPersona = 10; No es estatico un atributo, por eso tenemos un error
    }

    //Bloque de inicializacion NO estatico (contexto dinamico)
    {
        System.out.println("Ejecución de bloque NO estatico");
        this.idPersona = Persona.contadorPersona++;//Incrementamos el atributo
    }

    //Los bloques de inicializacion se ejecuta antes del contador

    public Persona(){
        System.out.println("Ejecucción del constructor");
    }

    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString(){
        return "Persona{"+ "IdPerosna= "+idPersona +"}";
    }
}
