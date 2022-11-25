/* 
  
 */
import java.util.Scanner;
public class EJESTACIONES {
public static void main(String[]args){
   
Scanner s=new Scanner(System.in);
 System.out.print("Introduce un mes ");
 int mes=s.nextInt();
String m;
m="";
 switch (mes) {
    case 1:
    case 2:
    case 3:
    m= "invierno"; 
    break;
     case 4:
     case 5:
     case 6:
    m= "primavera";
     break;
     case 7:
     case 8:
     case 9:
    m= "verano";
    break;
    case 10:
    case 11:
    case 12:
  m= "otoño";
  break;}
System.out.print("En el mes " + mes + " es " +m);
s.close();
}
}

