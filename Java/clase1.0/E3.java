import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
          Scanner input = new Scanner (System.in); 
        
        System.out.println("Digite la cantidad de autos:  ");
        String n = input.nextLine();

        System.out.println("Digite el valor del auto:  ");
        String a = input.nextLine();

        int sueldo = (Integer.parseInt(n) * 150) + ((Integer.parseInt(a)/100)*5) + 1000;
        
        System.out.printf( "El total del sueldo es:  " + sueldo);
    }
}
