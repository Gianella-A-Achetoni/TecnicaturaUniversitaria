package TercerSemestreee.Java.Leccion02.Enumeraciones;

public class testEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dias: "+ Dias.LUNES);
        indicarDiaSemana(Dias.LUNES);
        System.out.println("Continentes No. 4: "+ continentes.AMERICA);
        System.out.println("No. de paises: "+ continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes: "+ continentes.AMERICA.getHabitantes());
        System.out.println("Continentes No. 1: "+ continentes.AFRICA);
        System.out.println("No. de paises: "+ continentes.AFRICA.getPaises());
        System.out.println("No. de habitantes: "+ continentes.AFRICA.getHabitantes());
        System.out.println("Continentes No. 2: "+ continentes.EUROPA);
        System.out.println("No. de paises: "+ continentes.EUROPA.getPaises());
        System.out.println("No. de habitantes: "+ continentes.EUROPA.getHabitantes());
        System.out.println("Continentes No. 3: "+ continentes.ASIA);
        System.out.println("No. de paises: "+ continentes.ASIA.getPaises());
        System.out.println("No. de habitantes: "+ continentes.ASIA.getHabitantes());
        System.out.println("Continentes No. 5: "+ continentes.OCEANIA);
        System.out.println("No. de paises: "+ continentes.OCEANIA.getPaises());
        System.out.println("No. de habitantes: "+ continentes.OCEANIA.getHabitantes());
    }

    private static void indicarDiaSemana(Dias dias){
        switch (dias) {
            case LUNES:
                    System.out.println("Primer dia de la semana");
            break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
            break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
            break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
            break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
            break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
            break;
            case DOMINDO:
                System.out.println("Septimo dia de la semana");
            break;
            default:
                System.out.println("Valor ingresado incorrecto");
        }
    }

}
