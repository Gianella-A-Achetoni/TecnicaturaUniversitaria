package TercerSemestreee.Java.Leccion09.CalculadoraUTN;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("******* Aplicacion Calculadora *******");
            mostrarMenu();
            try{
                var operacion = Integer.parseInt(entrada.nextLine());
                if (operacion >= 1 && operacion <=4) {
                    mostrarEjecucion(operacion, entrada);
                }
                else if (operacion == 5) {
                    System.out.println("Hasta Luego...");
                    break;
                }else{
                    System.out.println("Opción erronea: " + operacion);
                }  
                System.out.println();
            }catch (Exception e) { // Fin del try, comienzo del catch.
                System.out.println("Ocurrio un error: " + e.getMessage());
                System.out.println();
            }
        }
        
    }
    private static void mostrarMenu(){
        
                //mostramos el menu
        System.out.println("""
                1. SUMA
                2. RESTA
                3. MULTIPLICACIÓN
                4. DIVICIÓN
                5. SALIR
                """);
        System.out.print("¿Operacón a realizar? ");
    }
    private static void mostrarEjecucion(int operacion, Scanner entrada){
        Double resultado;
        System.out.print("Digite el numero para el operando1: ");
        var Operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite el numero para el operando1: ");
        var Operando2 = Double.parseDouble(entrada.nextLine());
        switch (operacion) {
            case 1 ->{
                resultado = Operando1 + Operando2;
                System.out.println("Resultado de la suma: " + resultado);
            }
            case 2 -> { // Resta
                            resultado = Operando1 - Operando2;
                            System.out.println("Resultado de la resta: " + resultado);
            }
            case 3 -> { // Multiplicación
                resultado = Operando1 * Operando2;
                System.out.println("Resultado de la multiplicación: " + resultado);
            }
            case 4 -> { // División
                resultado = Operando1 / Operando2;
                System.out.println("Resultado de la división: " + resultado);
            }
            default -> System.out.println("Opción erronea: " + operacion);
                    
        }
    }
}
