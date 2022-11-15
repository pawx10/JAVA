/**
* Suma resta, multiplicacion y division
*
* @author Pablo Arroyo
*/


public class EJ4 {
    
    public static void main(String[] args) {
    String linea;
    System.out.println("Por favor introduce un numero:");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero =Integer.parseInt(linea);
    System.out.println("introduce otro numero");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
    System.out.println("La suma es " + ( primerNumero+segundoNumero));
    System.out.println("La resta es " + ( primerNumero-segundoNumero));
    System.out.println("La multiplicacion es " + ( primerNumero*segundoNumero));
    System.out.println("La division es " + ( primerNumero/segundoNumero));
    }  
}
