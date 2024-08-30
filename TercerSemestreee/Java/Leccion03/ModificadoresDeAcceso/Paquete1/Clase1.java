package TercerSemestreee.Java.Leccion03.ModificadoresDeAcceso.Paquete1;

public class Clase1 {
    public String atributoPublico = "Valor atributopublico";

    protected String atributoProtected ="Valor atributo protected";

    public Clase1(){
        System.out.println("Constructor public");
    }

    protected Clase1(String atributoProtected){
        System.out.println("Constructor protected");
    }

    public void metodoPublic(){
        System.out.println("Metodo public");
    }

    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
}
