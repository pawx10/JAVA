/*Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario. */
import java.util.Scanner;
 public class EJ10{
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int i,j,k,aux;

        int []num=new int [20];
        for ( i=0;i<20;i++){
            num[i]=(int)(Math.random()*100);
            System.out.print(num[i]+" ");
        }
        for (i=0;i<20;i++){
            j=i;
            while ((num[j++]%2!=0)&&(j<20));
            if(j<20){
                for (k=j-1;k>i;k--){
                    aux=num[k];
                    num[k]=num[k-1];
                    num[k-1]=aux;
                }
            }

        }
        System.out.println();
        System.out.print("\n Array: ");
        for (i=0;i<20;i++){
            System.out.print(num[i]+ " ");
        }
        
         
    }
 }