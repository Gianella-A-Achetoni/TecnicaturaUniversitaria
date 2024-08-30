import java.util.Scanner;

public class ejercicio1 {
     public static void main(String[] args) {
        Scanner fecha = new Scanner(System.in);

        System.out.println("ingrese un mes del año (del 1 al 12)");
        var a =Integer.parseInt(fecha.nextLine());

        switch ( a ) {
            case 1:
            case 2:
            case 3:
                System.out.println("Es verano");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Es otoño");
                break;
            case 7: 
            case 8:
            case 9:
                System.out.println("Es Invierno");
                break;    
            case 10: 
            case 11:
            case 12:
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Error");


        } 
    }
}
