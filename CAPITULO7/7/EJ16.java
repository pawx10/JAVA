/*Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes. */
import java.util.Scanner;
public class EJ16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] num=new int[20];
        int i;
        for(i=0;i<20;i++){
          num[i]=(int)(Math.random()*401); 
          System.out.print(num[i]+" ");
        }
        System.out.println(" Que numeros quiere resaltar?");
        System.out.println("1-Multiplos de 5");
        System.out.println("2-Multiplos de 7");
        int opcion=s.nextInt();


        int multiplo = (opcion == 1) ? 5 : 7;

        // Muestra el resultado.
        for (int elemento : num) {
          if (elemento % multiplo == 0) {
            System.out.print("[" + elemento + "] ");
          } else {
            System.out.print(elemento + " ");
    }
    
}
    }
}