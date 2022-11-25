/**
 * @author Pablo Arroyo

 *
 * Horoscopo
 * 
 */
import java.util.Scanner;
public class EJ10 {
    public static void main(String[]args){
Scanner s= new Scanner(System.in);
String horoscopo=" ";
System.out.print(" Introduce el mes en el que nacio ");
int mes= s.nextInt();
System.out.print("Ahora el dia en el que nacio ");
int dia=s.nextInt();
switch(mes){
    case 1://*enero */
    if (dia<=19){
horoscopo="capricornio";
    }
    if (dia>=20){
        horoscopo="acuario";
    }
    break;
    case 2://*febrero */
    if (dia<=18){
        horoscopo="acuario";
    }
    if (dia>=19){
        horoscopo="piscis";
    }
    break;
    case 3://*marzo */
    if (dia<=20){
        horoscopo= "piscis";
    }
    if(dia>=21){
        horoscopo="aries";
    
    }
    break;
    case 4: //*abril */
    if (dia<=19){
        horoscopo="aries";
    }
    if (dia>=20){
        horoscopo="tauro";
    }
    break;
    case 5://*mayo */
    if (dia<=20){
        horoscopo="tauro";
    }
    if (dia>=21){
        horoscopo="geminis";
    }
    break;
    case 6://*junio */
    if (dia<=20){
        horoscopo="geminis";

    }
    if (dia>=21){
        horoscopo="cancer";
    }
    break;
    case 7://*julio */
    if (dia<=22){
        horoscopo="cancer";
    }
    if (dia>=23){
        horoscopo="leo";
    }
    break;
    case 8://*agosto */
    if (dia<=22){
        horoscopo="leo";
    }
    if (dia>=23){
        horoscopo="virgo";
    }
    break;
    case 9://*septiembre */
    if (dia<=22){
        horoscopo="virgo";
    }
    if (dia>=23){
        horoscopo="libra";
    }
    break;
    case 10://*octubre */
    if (dia<=22){
        horoscopo="libra";
    }
    if (dia>=23){
        horoscopo="escorpio";
    }
    break;
    case 11://*noviembre */
    if (dia<=21){
        horoscopo="escorpio";
    }
    if (dia>=22){
        horoscopo="sagitario";
    }
    break;
    case 12://*diciembre */
    if (dia<=21){
        horoscopo="sagitario";
    }
    if (dia>=22){
        horoscopo="capricornio";
    }
    break;
}
System.out.print("Eres "+horoscopo);    
s.close();


   



}

    }
    

