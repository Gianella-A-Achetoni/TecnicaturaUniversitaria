import java.util.Scanner;

public class E1 {
  public static void main(String[] args) {
      Scanner input = new Scanner (System.in); 
      System.out.println("Digite 3 calificaciones: ");
      String n1 = input.nextLine();
      String n2 = input.nextLine();
      final String n3 = input.nextLine();

  int suma = ( Integer.parseInt(n1) + Integer.parseInt(n2) +  Integer.parseInt(n3)) ;

  System.out.printf ("La suma es: " + suma);

  }
}