/**
 * @author Pablo Arroyo
 * Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte
 */
import java.util.Scanner;
public class EJ7 {
    public static void main(String[]args){
        Scanner s=new Scanner (System.in);
        int intentos=4;
        int numintroduc;
        boolean acertado=false;
        do{
            System.out.print(" Introduce la clave de la caja fuerte ");
             numintroduc=s.nextInt();
             if (numintroduc==1234){
                acertado= true;
             }else{
                System.out.print(" Clave incorrecta.");
             }
             intentos--;
            }while((intentos>0)&&(!acertado));
            if(acertado){
                System.out.print(" Ha abierto la caja fuerte ");
            }else{
                System.out.print(" No quedan mas intentos");
                s.close();
            }

            }


    }
    

