/*
 * Numero y dia de la sem
 * @author
 */
import java.util.Scanner;
public class EJ3 {
public static void main(String[]args){  
Scanner s=new Scanner (System.in);
System.out.print(" Introduce un dia en numero");
int dia=s.nextInt();
String letra;
 letra=" ";
 switch(dia){
    case 1:
    letra="lunes";
    break;
    case 2:
    letra="martes";
    break;
    case 3:
    letra="miercoles";
    break;
    case 4:
    letra="jueves";
    break;
    case 5:
    letra="viernes";
    break;
    case 6:
    letra="sabado";
    break;
    case 7:
    letra="domingo";
    break;
 }
    System.out.print("El dia "+dia+" es "+letra);
    s.close();
    


}
}