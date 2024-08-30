import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

       Scanner input = new Scanner (System.in); 

       System.out.println("Digite la cantidad de dolares:  ");
       String n = input.nextLine();

       int Luis = Integer.parseInt(n) / 2 ; 
       int Juan = (Integer.parseInt(n) + Luis) / 2;
       int Total = Luis + Juan + Integer.parseInt(n);

       System.out.printf("El total es: " + Total);


    }
}
