/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado
 *@author Pablo Arroyo
 */
public class EJ9 {
    public static void main(String[] args) {
       int n=0;
       int cont=0; 
        while(n!=24){
           n=((int)(Math.random()*51)*2);
           System.out.println(n);
           cont++;

           

        }
        System.out.println("Se han generado: "+cont+" numeros");
    }
    
}
