package TercerSemestreee.Java.Leccion05.claseObject.conversionObjetos.domain;

import java.util.Objects;

public class Empleado1 {
    protected String nombre;
    protected double sueldo;

    public Empleado1(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles(){
        return "Nombre: " + this.nombre + ", Sueldo: " + this.sueldo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSueldo(){
        return sueldo;
    }

    public void serSueldo(double sueldo){
        this.sueldo = sueldo;
    }

    @Override
    public String toString(){
        return "Empleado{ " + "Nombre: " + nombre + ", Sueldo" + sueldo + "}" ;
    }
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32)); 
        return hash;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        final Empleado1 other = (Empleado1) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)){
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)){
            return false;
        }
        return true;
    }
}
