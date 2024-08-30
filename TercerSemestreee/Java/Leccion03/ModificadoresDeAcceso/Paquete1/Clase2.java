package TercerSemestreee.Java.Leccion03.ModificadoresDeAcceso.Paquete1;

class Clase2 {
    String atributoDefault = "Valor del atributo Default";
    
   // Clase2(){   System.out.println("Constructor Default");
   

    public Clase2(){
        this.atributoDefault = "Modificacion del atributo Default";
        System.out.println("Atributo Default =" + atributoDefault);
        this.metodoDefault();
    }

    void metodoDefault(){
        System.out.println("Metodo default");
    }
}
