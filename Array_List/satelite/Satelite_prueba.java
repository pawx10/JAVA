import java.util.Scanner;
import java.util.ArrayList;
public class Satelite_prueba {
    public static void main (String []args){
        Scanner s=new Scanner (System.in);
       ArrayList <Satelite> astro=new ArrayList <Satelite>();
        int i,seleccion;
        
      
        astro.add( new Satelite("Luna", 7342, 3474, 27.3, 27.3, 384400));
        astro.add( new Satelite("Fobos", 1072, 22.2, 7.7, 0.32, 9378));
        astro.add( new Satelite("Ío", 8.93, 3642, 1.77, 1.77, 421800));
        astro.add( new Satelite("Mimas", 3.8, 396, 0.94, 0.94, 185404));


        System.out.println("Los satelites son estos");
        System.out.println("--------------------------------");
        for(i=0;i<astro.size();i++){
            System.out.println(astro.get(i));
        }

        System.out.println("--------------------------------");
        System.out.println(" Seleccione el satelite que desea imprimir 1-4 ");
        seleccion=s.nextInt();

        
            System.out.println("Informacion del Satelite"+seleccion+": "+astro.get(seleccion-1).getNombre());
            
            System.out.println("Masa: "+astro.get(seleccion-1).getMasa()+" * 10¹⁹ kg");
            System.out.println("Diametro: "+astro.get(seleccion-1).getDiametro()+" km");
            System.out.println("Rotacion: "+astro.get(seleccion-1).getRotacion()+" dias");
            System.out.println("Traslacion: "+astro.get(seleccion-1).getTrasacion()+" dias");
            System.out.println("Distancia con el planeta: "+astro.get(seleccion-1).getDistancia()+" km");
            System.out.println("");
            System.out.println("-----------------------------");
        
    }

   
}
