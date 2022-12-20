/**
 * @author Pablo Arroyo
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios
 */
public class EJ4 {
    public static void main(String[] args) {
        int cont=0;
         int num;
      while (cont<20){
        num=((int)(Math.random()*11));
        System.out.print("  "+num);
        cont++;
        
        
          

      }
      
        
    }
}
