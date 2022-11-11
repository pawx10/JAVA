/**
* Lectura de datos desde teclado
*
* @author Pablo Arroyo
*/
public class ejnom {
public static void main(String[] args) {
String nombre;
System.out.print("dime tu nombre: ");
nombre = System.console().readLine();
String apellidos;
System.out.print("dime tus apellidos: ");
apellidos = System.console().readLine();
System.out.println("Hola " + nombre + apellidos+ "");
}
}