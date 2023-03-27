import java.util.Scanner;
public class Satelite_prueba {
    public static void main (String []args){
        Scanner s=new Scanner (System.in);
        Satelite[] astro=new Satelite[4];
        int i,seleccion;
        

        astro[0]= new Satelite("Luna", 7342, 3474, 27.3, 27.3, 384400);
        astro[1]= new Satelite("Fobos", 1072, 22.2, 7.7, 0.32, 9378);
        astro[2]= new Satelite("Ío", 8.93, 3642, 1.77, 1.77, 421800);
        astro[3]= new Satelite("Mimas", 3.8, 396, 0.94, 0.94, 185404);


        System.out.println("Los satelites son estos");
        System.out.println("--------------------------------");
        for(i=0;i<4;i++){
            System.out.println(+(i+1)+"."+astro[i].getNombre());
        }

        System.out.println("--------------------------------");
        System.out.println(" Seleccione el satelite que desea imprimir 1-4 ");
        seleccion=s.nextInt();

        
            System.out.println("Informacion del Satelite"+seleccion+": "+astro[seleccion-1].getNombre());
            
            System.out.println("Masa: "+astro[seleccion-1].getMasa()+" * 10¹⁹ kg");
            System.out.println("Diametro: "+astro[seleccion-1].getDiametro()+" km");
            System.out.println("Rotacion: "+astro[seleccion-1].getRotacion()+" dias");
            System.out.println("Traslacion: "+astro[seleccion-1].getTrasacion()+" dias");
            System.out.println("Distancia con el planeta: "+astro[seleccion-1].getDistancia()+" km");
            System.out.println("");
            System.out.println("-----------------------------");
        
    }

   
}
