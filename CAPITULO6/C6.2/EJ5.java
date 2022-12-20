/**
 * @author Pablo Arroyo
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.

 */
 public class EJ5{
   
    public static void main(String[] args) {
     
      int cont=0;
      int min=199;
      int max=100;
      int num;
      int sum=0;
        while(cont<50){
            num=((int)(Math.random()*100)+100);
          System.out.print("  "+num);
          sum+=num;
            cont++;
            if (num<min){
              min=num;
            }
            if (num>max){
              max=num;
            }
            
        }
        System.out.println("\nMínimo: " + min + "\nMáximo: " + max + "\nMedia: " + sum/50);
    }
 }