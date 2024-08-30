package TercerSemestreee.Java.Leccion03.ModificadoresDeAcceso.Paquete2;

public class Clase4 {
    private String atributoPrivate = "Atributo ptivate";

    private Clase4(){
        System.out.println("Constructor private");
    }
    public Clase4(String argumento){
        this();
        System.out.println("Constructor publico");
    }
    private void metodoPrivate(){
        System.out.println("Metodoprivate");
    }

    public String getAtributoPrivate(){
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate){
        this.atributoPrivate = atributoPrivate;
    }
}
