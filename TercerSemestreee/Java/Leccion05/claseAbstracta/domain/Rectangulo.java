package TercerSemestreee.Java.Leccion05.claseAbstracta.domain;

public class Rectangulo extends FiguraGeometrica{

    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }

    @Override
    public void dubujar(){
        System.out.println("Se imprime un: "+this.getClass().getSimpleName());
    }
}
