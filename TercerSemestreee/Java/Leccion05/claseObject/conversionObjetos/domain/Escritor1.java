package TercerSemestreee.Java.Leccion05.claseObject.conversionObjetos.domain;

public class Escritor1 extends Empleado1{
    final TipoEscritura tipoEscritura;

    public Escritor1(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo );
        this.tipoEscritura = tipoEscritura;
    }

    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Tipo escritura: " + tipoEscritura.getDescripcion();
    }
    @Override
    public String toString(){
        return "Escritor{" +"tipoEscritura: " + tipoEscritura + "} " + super.toString();
    }
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}
