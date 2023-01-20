import java.util.Scanner;
public class EJ6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] num=new int [15];
        int i;

        for(i=0;i<15;i++){
            
        System.out.println(" Introduce un num ");
        num[i]=sc.nextInt();
        }
        System.out.println();

        //muestra el array original//
        System.out.println(" Array original ");
        for (i=0;i<15;i++){
            System.out.printf(" |%3d",i);
        }
        System.out.println("|");
        for (i=0;i<75;i++){
            System.out.println("-");
        }
        System.out.println("-");
        for (i=0;i<15;i++){

        }
        System.out.println("|");
         // rota una posición a la derecha //////////
      int aux = num[14];
      for (i = 14; i > 0; i--) {
        num[i] = num[i-1];
      }
      num[0] = aux;
      ////////////////////////////////////////////

      // Muestra el array rotado /////////////////
      System.out.println("\nArray rotado a la derecha una posición:");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", i);
      }
      System.out.println("|");
      for (i = 0; i < 75; i++) {
        System.out.print("-");
      }
      System.out.println("-");
      for (i = 0; i < 15; i++) {
        System.out.printf("|%3d ", num[i]);
        
      }
      System.out.println("|");
      ////////////////////////////////////////////
        


      
        sc.close();
    }
    
}
