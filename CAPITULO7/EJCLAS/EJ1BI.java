/*tabla de filas y columnas que da el usuario rellena con valores random entre 100 y 200 */
/*lo mismo pero relleno de numeros pares depende de las filas y c: de dos en dos */
/*de este array busca los mutiplos de 3 y los mete en las posiciones pares de otro array
 * este array es de una dimension y de la longitud de f
 */
import java.util.Scanner;
public class EJ1BI {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int par=0;
        System.out.println(" Introduce el numero de filas");
        int f=s.nextInt();
        System.out.println(" Introduce el numero de columnas");
        int c=s.nextInt();
        int [] arrayf=new int [f];
        int mult3=0;
        int [][] array=new int [f][c];
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
               
                /*array[i][j]=(int)((Math.random()*101)+100);*//*esto ya no sirve, es para el random */
                
                array[i][j]=par;
                par+=2;
                
                System.out.printf("%7d",array[i][j]);
                if(array[i][j] %3==0 ){
                    arrayf[i]=array[i][j];
                }
                
            }
            System.out.println();
        }
        
        System.out.println(" Multiplos 3");
        for(int i=0;i<f;i++){
            System.out.printf("%7d", arrayf[i]);
        }
        
    
}
}