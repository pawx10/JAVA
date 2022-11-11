/**
* Lectura de datos desde teclado
*
* @author Pablo Arroyo
*/
public class EJ1 {
    public static void main(String[] args) {
        String linea;
        System.out.print("Por favor, introduce un número: ");
        linea = System.console().readLine();
        int primerNumero;
        primerNumero = Integer.parseInt( linea );
        System.out.print("introduce otro, por favor: ");
        linea = System.console().readLine();
        int segundoNumero;
        segundoNumero = Integer.parseInt( linea );
        int total;
        total = (2 * primerNumero) + segundoNumero;

        System.out.print("El resultado es " + primerNumero*segundoNumero);
       
    }
}
