 import java.util.Scanner;
 public class EJ21{
    public static void main(String[] args) {
      Scanner s=new Scanner (System.in);
      System.out.print(" Introduce la nota del primer examen: ");
      double primerexamen=s.nextDouble();  
      System.out.print(" Introduce la nota del segundo examen ");
      double segundoexamen=s.nextDouble();
      double media= (primerexamen+segundoexamen)/2;
      if(media>5){
         System.out.print(" Tu nota es: "+media);
      }else{
        
         System.out.print(" Cual ha sido el resultado de la recuperacion? apto/no apto: ");
         String recu=s.next();
         
         if(recu.equals("apto")){
            System.out.print(" Has aprobado");
         }if  (recu.equals("no apto")){ 
            System.out.print(" Has suspendido ");
         }
       }
       s.close();
    }
 }
        






        
 
