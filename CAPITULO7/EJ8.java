/*Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter.
 */
import java.util.Scanner;
public class EJ8 {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      
      int [] temp=new int [12];
      
      int i;
      
      
      String [] mes={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
      System.out.println(" Introduce la temperatura que ha hecho en cada mes:");
     
      for (  i=0;i<12;i++){
        System.out.print(" "+mes[i]+": ");
        temp[i]=s.nextInt();
      }
      for (i=0 ;i<12;i++){
        System.out.print("\n"+mes[i]);
        
      for (int j=0;j<temp[i];j++){
        System.out.print(" *");
   

      }
        }
      }
    



    }

